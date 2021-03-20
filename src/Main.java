import Bank.*;
import Bank.service.Auth;
import Bank.service.Display;
import Bank.service.Transactions;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Create usable object
        Scanner sc = new Scanner(System.in);
        Display dis = new Display();
        Auth auth = new Auth();
        Transactions tst = new Transactions();

        //Useful data
        int no, psc, key = 99, ono, status, count = 0;
        double amt;
        int[] login = new int[2];

        //Init data from database to model
        Account usr1 = Acc1();
        Account usr2 = Acc2();
        Account usr3 = Acc3();

        //Setup view
        AccountView view = new AccountView();

        //CreateController
        List<AccountController> ctr = new ArrayList<>();
        ctr.add(new AccountController(usr1, view));
        ctr.add(new AccountController(usr2, view));
        ctr.add(new AccountController(usr3, view));

        //Login Section
        //Connect to Auth service
        do {
            dis.printLoginAction();
            dis.printGetAccountNo(); no = sc.nextInt();
            dis.printGetPasscode(); psc = sc.nextInt();
            login = auth.LoginAs(no, psc, ctr);
        } while (login[0] != 1);

        //Login Success
        dis.printLoginSuccessful();
        
        //Transactions
        do {
            dis.printBankDetails();
            ctr.get(login[1]).updateView();
            for (int i = 0; i < ctr.size(); i++) {
                ctr.get(i).updateView("asList");
            }
            dis.printTransactionAction(); key = sc.nextInt();
            switch (key) {
                case 1:
                    do {
                        dis.printDepositAction();
                        dis.printGetAmount(); amt = sc.nextDouble();
                        status = tst.Deposit(amt, ctr.get(login[1]));
                        count++;
                        if(count > 2) break;
                    } while (status != 1);
                    break;
                case 2:
                    do {
                        dis.printWithdrawAction();
                        dis.printGetAmount(); amt = sc.nextDouble();
                        status = tst.Withdraw(amt, ctr.get(login[1]));
                        count++;
                        if(count > 2) break;
                    } while (status != 1);
                    break;
                case 3:
                    do {
                    dis.printTransferAction();
                    dis.printGetAccountNo(); ono = sc.nextInt();
                    dis.printGetAmount(); amt = sc.nextDouble();
                    status = tst.Transfer(ono, amt, ctr.get(login[1]), ctr);
                    count++;
                    if(count > 2) break;
                    } while (status != 1);
                    break;
                default:
                    break;
            }
            count = 0;
        } while (key != -1);

        /*
        System.out.println("= Accounts =");
        ctr1.updateView("asList");
        ctr2.updateView("asList");
        ctr3.updateView("asList");*/
    }

    //data
    private static Account Acc1() {
        Account acc1 = new Account();
        acc1.setAccountNo(1);
        acc1.setAmount(0.0);
        acc1.setPasscode(1234);;
        return acc1;
    }
    private static Account Acc2() {
        Account acc2 = new Account();
        acc2.setAccountNo(2);
        acc2.setAmount(10000.0);
        acc2.setPasscode(393120);;
        return acc2;
    }
    private static Account Acc3() {
        Account acc3 = new Account();
        acc3.setAccountNo(3);
        acc3.setAmount(2.93);
        acc3.setPasscode(1111);;
        return acc3;
    }         
}

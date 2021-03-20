package Bank.service;

import Bank.AccountController;
import java.util.*;

public class Transactions {
    Display dis = new Display();

    public int Deposit(double amt, AccountController myctr) {
        if (amt < 0) {
            dis.printError();
            return 0;
        } else {
            amt += myctr.getAmount();
            myctr.setAmount(amt);
            return 1;
        }
    }   

    public int Withdraw(double amt, AccountController myctr) {
        //check amount
        if (myctr.getAmount() < amt || amt < 0) {
            dis.printError();
            return 0;
        } else {
            amt = myctr.getAmount() - amt;
            myctr.setAmount(amt);
            return 1;
        }
    }

    public int Transfer(int ono, double amt, AccountController myctr, List<AccountController> ctr) {
        if (Withdraw(amt, myctr) != 1) {
            return 0;
        } else {
            for (int i = 0; i < ctr.size(); i++) {
                if(ctr.get(i).getAccountNo() == ono) {
                    Deposit(amt, ctr.get(i));
                    return 1;
                }
            }
            dis.printError();
            return 0;
        }
    }
}

//View data
package Bank;

public class AccountView {
    //UI after Login
    public void printAccountDetails(int AccountNo, double Amount) {
        System.out.println("Account No: " + AccountNo);
        System.out.println("Amount: " + Amount);
    }

    public void printAccountDetailsasList(int AccountNo, double Amount) {
        System.out.println("Account No: " + AccountNo + " Amount: " + Amount);
    }
}

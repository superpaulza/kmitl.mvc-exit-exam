package Bank.service;

public class Display {
    //UI for getData
    public void printGetInput() {
        System.out.print("Your Answer: ");
    }

    public void printGetAccountNo() {
        System.out.print("Account No: " );
    }

    public void printGetAmount() {
        System.out.print("Amount: ");
    }

    public void printGetPasscode() {
        System.out.print("Passcode: ");
    }

    //UI for Actions
    public void printTransactionAction() {
        System.out.println("<Press key> [1] Deposit\t [2] Withdrawal\t [3] Transfer\t [-1] Quit");
        System.out.print("Action: ");
    }

    public void printBankDetails() {
        System.out.println("= Bank Details =");
    }

    public void printLoginAction() {
        System.out.println("== Login ==");
    }

    public void printDepositAction() {
        System.out.println("== Deposit ==");
    }

    public void printWithdrawAction() {
        System.out.println("== Withdraw ==");
    }

    public void printTransferAction() {
        System.out.println("== Transfer ==");
    }

    //Print status
    public void printError() {
        System.err.println("Error");
    }

    public void printLoginUnsuccessful() {
        System.err.println("Login Unsuccessful!");
    }

    public void printLoginSuccessful() {
        System.out.println("Login Successful!");
    }

    public void printErrorAmt() {
        System.out.println("Amt error!");
    }

    public void printNotFound() {
        System.out.println("Error not found!");
    }

    public void printOperationComplete() {
        System.out.println("Operation Complete!");
    }

    public void printOperationFailture() {
        System.out.println("Operation Failture!");
    }    
}

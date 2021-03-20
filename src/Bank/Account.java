//Data Model
package Bank;

public class Account {
    private int AccountNo;
    private int Passcode;
    private double Amount;
    
    public int getAccountNo() {
        return AccountNo;
    }
      
    public void setAccountNo(int no) {
        this.AccountNo = no;
    }
      
    public int getPasscode() {
        return Passcode;
    }
      
    public void setPasscode(int psc) {
        this.Passcode = psc;
    }
      
    public double getAmount() {
            return Amount;
    }
      
    public void setAmount(double amt) {
            this.Amount = amt;
    }        
}

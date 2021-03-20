//Data Flow
package Bank;

public class AccountController {
    private Account model;
    private AccountView view;

    public AccountController(Account model, AccountView view){
        this.model = model;
        this.view = view;
    }

    public int getAccountNo() {
        return model.getAccountNo();
    }

    public void setAccountNo(int no) {
        model.setAccountNo(no);
    }

    public double getAmount() {
        return model.getAmount();
    }

    public void setAmount(double amt) {
        model.setAmount(amt);
    }

    public int getPasscode() {
        return model.getPasscode();
    }

    public void updateView() {
        view.printAccountDetails(model.getAccountNo(), model.getAmount());
    }
    
    public void updateView(String mode) {
        if (mode.equalsIgnoreCase("asList")) view.printAccountDetailsasList(model.getAccountNo(), model.getAmount());
    } 

}

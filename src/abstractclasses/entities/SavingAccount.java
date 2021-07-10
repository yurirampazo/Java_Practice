package abstractclasses.entities;

public class SavingAccount extends Account{
    private Double tax;

    public SavingAccount() {
        super();
    }

    public SavingAccount(Integer number, String holder, Double balance, Double tax) {
        super(number, holder, balance);
        this.tax = tax;
    }

    @Override
    public void withdraw(Double amount){
        balance -= amount + 2.0;
    }
}

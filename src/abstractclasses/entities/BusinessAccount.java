package abstractclasses.entities;

public class BusinessAccount extends Account{
    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount){
        if (loanLimit > 0 && amount <= loanLimit) {
            balance += amount - 10;
        }
        else throw new ArithmeticException("You can't loan," +
                " there is not enough limit to this operation");
    }
    @Override
    public void withdraw(Double amount){
        super.withdraw(amount);
        balance -= 2.0;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Holder: " + getHolder() + "\n");
        sb.append("Number: " + getNumber() + "\n");
        sb.append("Balance: $ " + getBalance() );
        sb.append("Loan limit: $" + getLoanLimit());
        return sb.toString();
    }
}

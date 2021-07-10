package inheritance_polymorphism.entities;

public class SavingAccountPlus extends SavingAccount{

    @Override
    public void withdraw(Double amount){
        balance -= amount + 2.0;
    }
}

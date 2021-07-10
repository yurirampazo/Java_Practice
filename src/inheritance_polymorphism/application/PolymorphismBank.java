package inheritance_polymorphism.application;

import inheritance_polymorphism.entities.Account;
import inheritance_polymorphism.entities.SavingAccount;

public class PolymorphismBank {
    public static void main(String[] args) {
        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingAccount(1022, "Maria", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println("x: " + x.getBalance());
        System.out.println("y: " + y.getBalance());
    }
}

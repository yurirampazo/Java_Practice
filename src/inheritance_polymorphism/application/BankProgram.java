package inheritance_polymorphism.application;

import inheritance_polymorphism.entities.Account;
import inheritance_polymorphism.entities.BusinessAccount;
import inheritance_polymorphism.entities.SavingAccount;

public class BankProgram {
    public static void main(String[] args) {

        // INHERITANCE EXAMPLES

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1001, "Ana", 0.0, 500.00);


        // UPCASTING

        Account acc1 = bacc;
        acc1.getBalance();
        Account acc2 = new BusinessAccount(103, "Rony", 0.0, 200.00);
        Account acc3 = new SavingAccount(104, "Gandalf", 0.0, 500.0);


        // DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.00);

        //Casting "permitido" até o tempo de execução.
        //BusinessAccount acc5 = (BusinessAccount) acc3;   errado
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.00);
            System.out.println("Loan!");
        }

        if ( acc3 instanceof  SavingAccount) {
            SavingAccount acc5 = (SavingAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        //TESTE @OVERRIDE
        Account acc6 = new Account(109,"Yuri",1000.00);
        acc6.withdraw(200.00);
        System.out.println(acc6.getBalance());

        Account acc7 = new SavingAccount(110, "Jason", 1000.00, 0.01);
        acc7.withdraw(200.00);
        System.out.println(acc7.getBalance());


        Account acc8 = new BusinessAccount(111, "Charles", 1000.00, 200.00);
        acc8.withdraw(200.00);
        System.out.println(acc8.getBalance());
    }
}

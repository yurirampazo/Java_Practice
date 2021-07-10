package abstractclasses.application;

import abstractclasses.entities.Account;
import abstractclasses.entities.BusinessAccount;
import abstractclasses.entities.SavingAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AbstractClassesTest {
    public static void main(String[] args) {
        //Account acc1 = new Account(1001, "Alex", 1000.0);
        //Account acc2 = new BusinessAccount(1015, "Yuri", 1000.0, 200.00);
        //Account acc3 = new SavingAccount(1003, "JotaP", 1000.0, 0.01);
        Locale.setDefault(Locale.US);

        List<Account> list = new ArrayList<>();
        list.add(new BusinessAccount(101,"jorge", 500.0, 400.0));
        list.add(new BusinessAccount(1048,"maria", 500.0, 500.0));
        list.add(new SavingAccount(502,"jennifer", 500.0, 0.01));
        list.add(new SavingAccount(6589, "victor", 500.0, 0.05));

        double sum = 0.0;

        for (Account acc : list) {
            sum += acc.getBalance();
        }
        System.out.println("Total balance: $ " + String.format("%.2f",sum));

        for (Account acc : list) {
            acc.deposit(10.0);
        }

        sum = 0.0;
        for (Account acc : list) {
            System.out.printf("Updated balance for account %d : $ %.2f \n", acc.getNumber(), acc.getBalance());
            sum += acc.getBalance();
        }
        System.out.println("Total balance: $ " + String.format("%.2f",sum));
    }
}

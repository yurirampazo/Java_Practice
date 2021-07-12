package exceptions.mvcpattern.application;

import exceptions.mvcpattern.model.entities.Account;
import exceptions.mvcpattern.model.exception.WithdrawException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AccountProgram {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Account Data: ");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial Balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw Limit: ");
            double withdrawLimit = sc.nextDouble();

            Account acc = new Account(number, holder, balance, withdrawLimit);

            System.out.println();
            System.out.print("Type the withdraw amount: ");
            double amount = sc.nextDouble();

            acc.withdraw(amount);
            System.out.printf("New Balance: %.2f%n", acc.getBalance());
        } catch (WithdrawException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Mismatching data!");
        }

        sc.close();
    }
 }


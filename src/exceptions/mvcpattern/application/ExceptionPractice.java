package exceptions.mvcpattern.application;

import exceptions.mvcpattern.model.entities.Reservation;
import exceptions.mvcpattern.model.exception.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExceptionPractice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

        try {
            System.out.print("Room number: ");
            int number = sc.nextInt();
            System.out.print("Check-in date (DD/MM/YYYY) ");
            Date checkin = sdf.parse(sc.next());
            System.out.print("Check-out date (DD/MM/YYYY) ");
            Date checkout = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkin, checkout);
            System.out.println("Reservation: \n" + reservation);
            System.out.println();
            System.out.println("Do you want to update the reservation (y/n)?  ");
            char ch = sc.next().toLowerCase().charAt(0);
            if (ch == 'y') {
                System.out.println("Type the data to update the reservation: ");

                System.out.print("Check-in date (DD/MM/YYYY) ");
                checkin = sdf.parse(sc.next());
                System.out.print("Check-out date (DD/MM/YYYY) ");
                checkout = sdf.parse(sc.next());

                reservation.updateDates(checkin, checkout);
                System.out.println("Reservation: " + reservation);
            }

            System.out.println("Good Trip! See you soon");
        } catch (ParseException exception) {
            System.out.println("Invalid date format");
        } catch (DomainException exception) {
            System.out.println("Error in reservation " + exception.getMessage());
        } catch (RuntimeException exception) {
            System.out.println("Unexpected error!");
        }



        sc.close();
    }
}

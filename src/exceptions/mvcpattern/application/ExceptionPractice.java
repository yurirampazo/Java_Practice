package exceptions.mvcpattern.application;

import exceptions.mvcpattern.model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ExceptionPractice{
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

        System.out.print("Room number: ");
        int number = sc.nextInt();
        System.out.print("Check-in date (DD/MM/YYYY) ");
        Date checkin = sdf.parse(sc.next());
        System.out.print("Check-out date (DD/MM/YYYY) ");
        Date checkout = sdf.parse(sc.next());

        if (!checkout.after(checkin)) { //Se o checkout NÃO(!) for depois do checkin
            System.out.println("Error in reservation, check-out date must be after check-in date");
        } else {
            Reservation reservation = new Reservation(number,checkin, checkout);
            System.out.println("Reservation: \n" + reservation);
            System.out.println();
            System.out.println("Do you want to update the reservation (y/n)?  ");
            char ch = sc.next().toLowerCase().charAt(0);
            if (ch =='y') {
                System.out.println("Type the data to update the reservation: ");

                System.out.print("Check-in date (DD/MM/YYYY) ");
                checkin = sdf.parse(sc.next());
                System.out.print("Check-out date (DD/MM/YYYY) ");
                checkout = sdf.parse(sc.next());

                String error = reservation.updateDates(checkin, checkout);
                String errorMsg = (error != null)? "Error in reservation " + error : "Reservation " + reservation;
                System.out.println(errorMsg);
            }

            System.out.println("Good Trip! See you soon");
        }
        sc.close();
    }
}

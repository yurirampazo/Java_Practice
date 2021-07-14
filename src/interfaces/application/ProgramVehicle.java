package interfaces.application;

import interfaces.model.entities.CarRental;
import interfaces.model.entities.Vehicle;
import interfaces.model.service.BrazilTaxService;
import interfaces.model.service.RentalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramVehicle {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

        System.out.println("Type rental data: ");
        System.out.print("Car model: ");
        String carModel = sc.nextLine();
        System.out.print("Pickup (dd/mm/yyyy hh:ss)? ");
        Date start = sdf.parse(sc.next());
        System.out.print("Return (dd/mm/yyyy hh:ss)? ");
        Date finish = sdf.parse(sc.next());

        CarRental cr = new CarRental(start,finish, new Vehicle(carModel));

        System.out.println("Enter price per hour: ");
        double pricePerHour = sc.nextDouble();
        System.out.println("Enter price per day: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("INVOICE");
        System.out.println("Basic Payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Total Payment: " + String.format("%.2f", cr.getInvoice().getTotatlPayment()));
        sc.close();
    }

}

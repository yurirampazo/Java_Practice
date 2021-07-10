package inheritance_polymorphism.application;

import inheritance_polymorphism.entities.Employee;
import inheritance_polymorphism.entities.OutsourcedEmployee;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeesProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("Type the number of Employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + " data: ");
            System.out.print("Is the employee outsourced? (y/n) ");
            char ch = sc.next().toLowerCase().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (ch == 'y') {
                System.out.print("Type the Additional Charge: $");
                double additionalCharge = sc.nextDouble();
                //Employee emp = new OutsourcedEmployee(name,hours,valuePerHour,additionalCharge);
                //list.add(emp);
                list.add(new OutsourcedEmployee(name,hours,valuePerHour,additionalCharge));

            } else {
                //Employee emp = new Employee(name, hours, valuePerHour);
                //list.add(emp);
                list.add(new Employee(name,hours,valuePerHour));
            }

            System.out.println();
            System.out.println("PAYMENTS: ");
            for (Employee e : list) {
                System.out.println(e.getName() + " - $ " + String.format("%.2f", e.payment()));

            }
            System.out.println();
        }




        sc.close();
    }
}

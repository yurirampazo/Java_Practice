package exceptions;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        method1();
        System.out.println("End of program!");

    }

    public static void method1(){
        System.out.println("****Starting Method 1****");
        method2();
        System.out.println("****Ending Method 1****");
    }

    public static void method2(){

        System.out.println("****Starting Method 2****");
            Scanner sc = new Scanner(System.in);

        try {
            String [] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Position");
            e.printStackTrace();
            sc.next();  // Para visualização da Stack Trace
        } catch (InputMismatchException e) {
            System.out.println("Expected a integer number");
        }
        sc.close();
        System.out.println("****Ending Method 2****");
    }
}

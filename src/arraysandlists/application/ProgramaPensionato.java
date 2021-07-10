package arraysandlists.application;

import java.util.Locale;
import java.util.Scanner;

import arraysandlists.entities.Room;

public class ProgramaPensionato {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine();
        Room[] rooms = new Room[n];
        
        for (int i = 0; i < rooms.length; i++) {
            System.out.println("Rent #" + (i + 1));
            String name = sc.nextLine();
            String email = sc.nextLine();
            int number = sc.nextInt();
            sc.nextLine();
            rooms[i] = new Room(name, email, number);
            System.out.println();
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < rooms.length; i++) {
            if(rooms[i] != null) {
                System.out.println(i + ": " + rooms[i].getName() 
                + ", " + rooms[i].getEmail());
            }
        }
        sc.close();
    }
}
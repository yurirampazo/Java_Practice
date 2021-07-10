package abstractclasses.application;

import abstractclasses.entities.Circle;
import abstractclasses.entities.Rectangle;
import abstractclasses.entities.Shape;
import abstractclasses.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AbstractClasses2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.println("Type the number of shapes: ");
        int n = sc.nextInt();

        for (int i=0; i < n; i++) {
            System.out.println("Shape #" + (i + 1) + "data: " );
            System.out.print("Rectangle or Circle? (r/c)? ");
            char type = sc.next().toLowerCase().charAt(0);
            System.out.print("Color (RED/GREEN/BLUE)? ");
            Color color = Color.valueOf(sc.next());

            if(type == 'r') {
                System.out.println("You chose rectangle");
                System.out.println("Type the rectangle dimensions: ");
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.println("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height));
            } else if (type == 'c') {
                System.out.println("You chose circle");
                System.out.println("Type the rectangle dimensions: ");
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape i : list ) {
            System.out.println(i.area());
        }

        sc.close();
    }
}

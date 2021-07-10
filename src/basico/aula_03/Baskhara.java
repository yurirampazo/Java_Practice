package basico.aula_03;

import java.util.Scanner;

public class Baskhara {
     ;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Calculadora de Bhaskara:");
        System.out.println("------------------------");
        System.out.println("Digite o valor de A, B e C inserindo espaço entre eles: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();


         final double delta = Math.pow(b, 2.0) - 4*a*c; 

         double x1 = -b + Math.sqrt(delta) /  (2*a);
         double x2 = -b + Math.sqrt(delta) /  (2*a);

         System.out.println("Delta = " + delta);
         System.out.println("X1 = " + x1);
         System.out.println("X2 = " + x2);
    }
    
}

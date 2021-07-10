package basico.aula_08;

import java.util.Scanner;

public class Funcoes {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        System.out.println("Type three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        //TENÁRIO
        /* String highest = (a > b && a > c) ? "Highest: " + a: a + "isn't the highest";
        System.out.println(highest);

        highest = (b > a && b > c) ? "Highest: " + b: b + " isn't the highest";
        System.out.println(highest);
        
        highest = (c > a && c > b) ? "Highest: " + c: c + " isn't the highest";
        System.out.println(highest);
        
        System.out.println("End"); */

        int highest = max(a, b, c); 
        showResult(highest);
        sc.close();
    }

    public static int max(int x, int y, int z) {
        int aux = 0; 
        int higher = (x > y && x > z) ? aux = x : 0;
        higher = (y > x && y > z) ? aux = y : 0;
        higher = (z > x && z > y) ? aux = z : 0;
        return aux;
    }

    public static void showResult(int value){
        System.out.println("Highest = " + value);
    }
}

package basico.aula_02;

import java.util.Scanner;

public class EstudosScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Lendo muitas variáveis em apenas uma linha */

        System.out.println("Digite um nome - um número inteiro - um número com casas decimais: ");
        String x = sc.next();
        int y = sc.nextInt();
        double z = sc.nextDouble();

        System.out.println("Dados diigtados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }
}
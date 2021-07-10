package basico.aula_04;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continua = false;
        char resposta = 'N';

        
        do {
            
            System.out.println("Digite um número para o dia da semana:");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Domingo");
                    break;

                case 2:
                    System.out.println("Segunda");
                    break;

                case 3:
                    System.out.println("Terça");
                    break;

                case 4:
                    System.out.println("Quarta");
                    break;

                case 5:
                    System.out.println("Quinta");
                    break;

                case 6:
                    System.out.println("Sexta");
                    break;

                case 7:
                    System.out.println("Sábado");
                    break;

                default:
                    System.out.println("Valor inválido!");
                    break;
            }

            System.out.println("Deseja continuar? [S/N]");
            resposta = sc.next().toUpperCase().charAt(0);

            if (resposta == 'S') {
                continua = true;
            } else {
                continua = false;
            }

        } while (continua == true);
        System.out.println("Até mais!!!");
    }
}
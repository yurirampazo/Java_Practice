package basico.aula_05;

import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       /*  Estrutura opcinal ao if- else  quando se deseja decidir um valor com base em uma condição.

        Sintaxe:

        ( condição ) ? valor-se-verdadeiro : valor-se-falso;

        Exemplos:

        ( 2 > 4 ) ? "Prove!" : "Exatamente! 2 é MENOR que quatro!" */

        double preco = 34.5;
        double desconto =  (preco < 20.0) ? preco * 0.1: preco * 0.05;
        System.out.println( desconto);

        String teste =  ( 2 > 4) ? "Prove" : "Falso! Dois é MENOR que quatro";
        System.out.println(teste);
    }

}

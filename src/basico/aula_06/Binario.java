package basico.aula_06;

import java.util.Scanner;

public class Binario {

    public static void main(String[] args) {
        /*
        DECLARAÇÃO DE VARIÁVEL BINÁRIA:
        UTILIZAR 0b antes do numero em formato binario;

        Exemplo:
        int mask = 0b00100000;
        */
        Scanner sc = new Scanner(System.in);
        int mask = 0b00100000; //32
        // 89 =    0b01011001
        //113=     0b00100000
        System.out.println("Digite um número para compará-lo com o 32 &, | e ^");
        int n = sc.nextInt();
        String resultadoE= ((n & mask) != 0 ) ? "6th bit  is true" : "6th bit is false";
        System.out.println(resultadoE);
        
        String resultadoOu = ((n | mask) != 0 ) ? "6th bit  is true" : "6th bit  is false";
        System.out.println(resultadoOu);
        
        String resultadoOuE = ((n ^ mask) != 0 ) ? "6th bit  is true" : "6th bit  is false";
        System.out.println(resultadoOuE);

        sc.close();
    } 
}
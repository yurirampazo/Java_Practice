package basico.aula_02;

import java.util.Scanner;

public class EstudoScanner2 {

    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
        
            /* Lendo muitas variáveis em apenas uma linha */
        
            System.out.println("Digite um nome - um número inteiro - um número com casas decimais: ");
            int x = sc.nextInt();
            sc.nextLine();  // limpar o buffer de leitura para que a quebra de linha não consuma uma variável.
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String s3 = sc.nextLine();
        
            System.out.println("Dados diigtados: ");
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
        
            sc.close();
        }

}

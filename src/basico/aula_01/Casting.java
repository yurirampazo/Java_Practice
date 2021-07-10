package basico.aula_01;

public class Casting {
    public static void main(String[] args) {
        
       /*  Se quisermos dividir um número inteiro por outro inteiro e seu resultado for um ponto flutuante. Não será possível visualizar os seus números decimais. */
        int a = 5, b =2;
        double resultado = 0;

        resultado = a/ b;

        System.out.println(resultado);
       /*  Utilizando o método de casting para poder corrigir esse problema sem ter que declarar as duas primeiras variáveis como double. */


       resultado = (double) a/b;
       System.out.println(resultado);



    }
    
}

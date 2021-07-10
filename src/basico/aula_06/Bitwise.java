package basico.aula_06;

public class Bitwise {
    public static void main(String[] args) {
        
        /*
        Uso de operadores lógicos bitwise para entendimento das expressões bin.

        Operador:
            |  -> OU bit a bit: (Verdadeiro quando uma ou mais condições são verdadeiras)
            ^ ->  OU-EXCLUSIVO bit a bit: (Verdadeiro quando apenas UMA das condições é veradadeira)
            & -> E bit a bit: (Verdadeiro apenas quando todas as condições são verdadeiras)

        */

        int n1 = 89;
        int n2 = 60;


        /* 
        COMPARAÇÃO BIN

        (89) 0101 1001

        (60) 0011 1100

         & = 0001 1000 = (125)

         | = 0111 1101 = (101)

         ^ = 0110 0101 = (24)
        
        
         */

        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);
        System.out.println(n1 & n2);

    }
    
}

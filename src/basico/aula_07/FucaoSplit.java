package basico.aula_07;

public class FucaoSplit {
    public static void main(String[] args) {
        /*        
        Funcionamento da função Split
        */
        String s = "apple orange lemon pineapple";
        String[] vect = s.split(" "); /*  o vetor recebe cada sub string da string com split. Indicar o separador(split) que será o padrão*/

        /* CADA STRING SEPARADA PELO split. é atribuida a uma posição do vetor  split*/
        String fruta1 = vect[0];
        String fruta2 = vect[1];
        String fruta3 = vect[2];
        String fruta4 = vect[3];
        System.out.println("Frutas juntas: " + s);
        System.out.println("Fruta 1: " + fruta1);
        System.out.println("Fruta 2: " + fruta2);
        System.out.println("Fruta 3: " + fruta3);
        System.out.println("Fruta 4: " + fruta4);
    }
}

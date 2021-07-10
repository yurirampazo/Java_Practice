package arraysandlists.application;

import java.util.ArrayList;
import java.util.List;


public class ForEach {
    public static void main(String[] args) {
        


        /*
        For each é utilizado para percorrer listas, 
        mas também pode ser usado com arrays.
        Vantagem, não precisa de uma variavel pra iterar a lista
        e é menos verboso.
        
        */
        int[] vector = {3,4,5};

        List<Integer> lista = new ArrayList<>();
        lista.add(6);
        lista.add(7);
        lista.add(8);

        System.out.println("Imprime lista: ");
        for (Integer i : lista) {
            System.out.println(i);
          
        }

        System.out.println("Imprime array: ");
        for (int primitivo : vector) {
            System.out.println(primitivo);
        }

    }
}

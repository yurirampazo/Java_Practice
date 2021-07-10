package collections;

import java.time.LocalDate;
import java.util.*;

public class Lista {

    public static void main(String[] args) {

        List<String> filmes = new ArrayList<>();
       // List<String> filmes2 = new LinkedList<>();

        String filme1 = "XXX";
        String filme2 = "LOTR";
        String filme3 = "Harry Potter";
        String filme4 = "Velozes e Furiosos";
        String filme5 = "Thor";

//        filmes.add(filme1);
//        filmes.add(filme2);
//        filmes.add(filme3);
//        filmes.add(filme4);
//        filmes.add(filme5);

        filmes.addAll(Arrays.asList(filme1,filme2,filme3, filme4, filme5));

        //Compara alfabética e de 0 a 9
        filmes.sort(Comparator.naturalOrder());
        System.out.println(filmes);
        filmes.sort(Comparator.reverseOrder());
        System.out.println(filmes);

        Collections.sort(filmes);
        System.out.println(filmes);

        List<Jogo> listaGames = new ArrayList<>(Arrays.asList(new Jogo("Dota","Jogo MOBA"),
                new Jogo("LOL","Jogo Moba"),
                new Jogo("Fifa", "Jogo de futebol")));

        listaGames.sort(Comparator.comparing(Jogo::getName, String.CASE_INSENSITIVE_ORDER).reversed());

//        System.out.println("Print this motherfucking code: "+ listaGames.sort(Comparator.reverseOrder());

            new Jogo("Left 4 Dead", "Apocalipse Zumbi");




    }
}

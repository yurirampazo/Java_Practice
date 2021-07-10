package arraysandlists.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramList {

    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("Yuri");
        list.add("Kenyo");
        list.add("Pedro");
        list.add(2, "Katia");

        System.out.println("lista: ");
        
        for (String i : list){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Tamanho da lista: " + list.size());
        System.out.println();
        
        System.out.println("Impressão após remoção por parâmetro: ");
        list.remove("Katia");
        for (String i : list){
            System.out.println(i);
        }
        
        System.out.println();
       
        System.out.println("Impressão após remoção por indice: ");
        list.remove(2);
        for (String i : list) {
            System.out.println(i);
        }

        System.out.println("---------------");
        System.out.println("Impressão após adicionar Karen e Katiau");

        list.add("Karen");
        list.add("Katia");

        for (String i : list) {
            System.out.println(i);
        }
        System.out.println("-------------------");
        list.removeIf(x -> x.toUpperCase().charAt(0) == 'K');
        
        for (String i : list) {
            System.out.println(i);
        }

        System.out.println("--------------------");
        list.add("heitor");
        System.out.println("Index of heitor: " + list.indexOf("heitor"));
        System.out.println("Index of Yuri: " +list.indexOf("Yuri"));
        System.out.println("Index of Felipe: " +list.indexOf("Felipe"));
        
        System.out.println("--------------------");
        
        List<String> newList = list.stream().filter(x -> x.charAt(0) == 'K').collect(Collectors.toList());  
        
        for (String result : newList) {
            System.out.println(result);
        }
        
        System.out.println("--------------------");
        
        String name = list.stream().filter(x -> x.charAt(0) == 'h').findFirst().orElse(null);
        System.out.println(name);
        
        System.out.println("--------------------");
        System.out.println("Null name");
        String nameNull = list.stream().filter(x -> x.toUpperCase().charAt(0) == 'Ç').findAny().orElse(null);
        System.out.println(nameNull);

      




    }

}

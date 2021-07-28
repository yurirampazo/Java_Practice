package genericassetmap.application;

import genericassetmap.model.entities.Client;

public class equalsHashCodeProgram {
    public static void main(String[] args) {
        
        String a = "Yuri";
        String b = "Heitor";
        System.out.println("Comparação com método equals: ");
        //COMPARAÇÃO EQUALS
        System.out.println(a.equals(b));

        System.out.println("---------------------------------");
        //HASH CODE COMPARAÇÃO
        System.out.println("Comparação pelo método HashCode: ");
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        System.out.println("-----------------------------");
        System.out.println("Comparação utilizando == para String: ");
        System.out.println(a == b);

        System.out.println("---------------------");
        //COMPARAÇÃO DE OBJETOS PERSONALIZADOS COM HASH CODE E EQUALS
        System.out.println("Emails e nomes diferentes: ");
        Client c1 = new Client("Nereide", "donane.gmail.com");
        Client c2 = new Client("Caetano", "caetano.gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));

        //emails e nomes iguais
        System.out.println("-------------------------");
        System.out.println("Emails e nomes iguais: ");
        Client c3 = new Client("Maria", "maria.gmail.com");
        Client c4 = new Client("Maria", "maria.gmail.com");

        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
        System.out.println(c3.equals(c4));
        System.out.println(c3 == c4);
        System.out.println("----------------------------");

        System.out.println("Comaparação de duas Strings usando equals ou == ");
        String x = "Oi";
        String y = "Oi";
        System.out.println(x.equals(y));
        System.out.println(x == y);



    }
}

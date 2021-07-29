package genericassetmap.application;

import genericassetmap.model.entities.Product;

import java.util.HashSet;
import java.util.Set;

public class SetProgramExample3 {
    public static void main(String[] args) {

        Set<Product> set = new HashSet<>();

        set.add(new Product("TV", 3000.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.00));

        Product prod = new Product("Notebook", 1200.0);

        System.out.println(set.contains(prod));
    }

}

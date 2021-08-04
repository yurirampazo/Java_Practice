package lambdaexpressions.application;

import lambdaexpressions.model.entities.Product;
import lambdaexpressions.model.service.MyComparator;

import java.util.*;

public class Program1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        list.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));

        for (Product p : list) {
            System.out.println(p);  
        }
    }
}

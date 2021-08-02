package lambdaexpressions.application;


import lambdaexpressions.model.entities.Product;
import lambdaexpressions.model.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PredicateExample {
    public static void main(String[] args) {

        // Example With util class extending the interface Predicate

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        list.removeIf(new ProductPredicate());

        for (Product p : list) {
            System.out.println(p);
        }





    }
}
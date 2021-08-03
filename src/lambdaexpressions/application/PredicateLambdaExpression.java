package lambdaexpressions.application;

import lambdaexpressions.model.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class PredicateLambdaExpression {
    public static void main(String[] args) {

        // Declared Lambda Expression

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double min = 100.0;

        Predicate<Product> pred = p -> p.getPrice() >= min;

        list.removeIf(pred);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}

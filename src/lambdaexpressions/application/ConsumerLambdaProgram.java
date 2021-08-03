package lambdaexpressions.application;

import lambdaexpressions.model.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class ConsumerLambdaProgram {
    public static void main(String[] args) {

        //Inline Lambda

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double factor = 1.1;

        list.forEach(c -> c.setPrice(c.getPrice() * factor));
        list.forEach(System.out::println);
    }
}

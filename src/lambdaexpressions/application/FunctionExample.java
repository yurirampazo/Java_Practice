package lambdaexpressions.application;

import lambdaexpressions.model.entities.Product;
import lambdaexpressions.model.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //Static Reference Method
       // List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());


        //Non-static reference method
        //List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());


        //Declared Lambda
        //Function<Product, String> function = f -> f.getName().toUpperCase();
       // List<String> names = list.stream().map(function).collect(Collectors.toList());

        //Inline Lambda -> Prettier
        List<String> names = list.stream().map(f -> f.getName().toUpperCase()).collect(Collectors.toList());


        names.forEach(System.out::println);

    }

}

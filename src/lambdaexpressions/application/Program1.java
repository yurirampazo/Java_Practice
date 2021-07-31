package lambdaexpressions.application;

import lambdaexpressions.model.entities.Product;
import lambdaexpressions.model.service.MyComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program1 {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        list.sort(new MyComparator());

        for (Product p : list) {
            System.out.println(p);
        }
    }
}

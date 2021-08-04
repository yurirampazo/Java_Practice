package lambdaexpressions.application;

import lambdaexpressions.model.entities.Product;
import lambdaexpressions.model.service.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ReviewProgram {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));
        list.add(new Product("Mouse", 140.00));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, x -> x.getName().toUpperCase().charAt(0) == 'T');
        double sumPricesM = ps.filteredSum(list, x -> x.getName().charAt(0) == 'M');
        double pricesLower100 = ps.filteredSum(list, x -> x.getPrice() <100.00);


        System.out.println("Sum T = " + String.format("%.2f", sum));
        System.out.println("Sum M = " + String.format("%.2f", sumPricesM));
        System.out.println("Sum of prices lower than 100.00 U$D");

    }
}

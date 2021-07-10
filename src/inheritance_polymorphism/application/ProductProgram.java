package inheritance_polymorphism.application;

import inheritance_polymorphism.entities.ImportedProduct;
import inheritance_polymorphism.entities.Product;
import inheritance_polymorphism.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ProductProgram {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> products = new ArrayList<>();
        System.out.println("Type the number of products: ");

        int n = sc.nextInt();

        for (int i=0; i < n; i++) {
            System.out.println("Product # " + (i + 1) + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().toLowerCase().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: $ ");
            double price = sc.nextDouble();
            if (ch == 'c') {
                products.add(new Product(name, price));
            } else if (ch == 'i') {
                System.out.print("Custom fees: ");
                double customFees = sc.nextDouble();
                products.add(new ImportedProduct(name,price,customFees));
            } else if (ch == 'u') {
                System.out.print("Manufactured date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());
                products.add(new UsedProduct(name,price, manufactureDate));
            }

        }

        System.out.println("PRICE TAGS: ");
        System.out.println();
        for (Product list : products) {
            System.out.println(list.priceTag());
        }
        sc.close();
    }
}

package genericassetmap.application;


import genericassetmap.model.entities.Product;
import genericassetmap.model.service.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenericsD {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        String path = "C:\\temp:\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0],Double.parseDouble(fields[1]) ));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Most Expensive: " + x);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

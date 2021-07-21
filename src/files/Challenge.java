package files;


import files.entities.Product;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.println("Type the file path: ");
        String sourceFileString = sc.nextLine();

        File sourceFile = new File(sourceFileString);
        String sourceFolderString = sourceFile.getParent();

        boolean success = new File(sourceFolderString + "\\out").mkdir();

        String targetFileStr = sourceFolderString + "\\out\\summary.cvs";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileString))){

            String itemCvs = br.readLine();
            while (itemCvs != null) {

                String[] fields = itemCvs.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                itemCvs = br.readLine();

            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
                for (Product item : list) {
                    bw.write(item.getName() + ", " + String.format("%.2f", item.total()));
                    bw.newLine();
                }

                System.out.println(targetFileStr + " CREATED!");
            } catch (IOException e){
                System.out.println("Error writing file: " + e.getMessage());
            }
        } catch (IOException e){
            System.out.println("Error reading file " + e.getMessage());  }
        sc.close();
    }

}

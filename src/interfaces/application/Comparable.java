package interfaces.application;

import interfaces.model.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable {
    public static void main(String[] args) {

        String path = "c:\\temp\\in.txt";
        List<Employee> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String employeeCsv = br.readLine();
            while (employeeCsv != null){
                String[] fields =employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }

            Collections.sort(list);
            for (Employee i : list) {
                System.out.println(i);
            }

        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}

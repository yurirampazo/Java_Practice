package interfaces.model.entities;

import interfaces.model.service.Printer;
import interfaces.model.service.Scanner;

public class ComboDevice extends Device implements Scanner, Printer {
    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Combo method! " + doc);
    }

    @Override
    public void print(String doc) {
        System.out.println(doc);
    }

    @Override
    public String scan() {
        return "I'm Scanning this thing To my vlog";
    }
}

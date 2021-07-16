package interfaces.model.entities;

import interfaces.model.service.Printer;

public class ConcretePrinter extends Device implements Printer {
    public ConcretePrinter(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Print processing: " + doc);
    }

    public void print(String doc){
        System.out.println("Printing: " + doc);
    }
}

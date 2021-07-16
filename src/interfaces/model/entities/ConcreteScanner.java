package interfaces.model.entities;

import interfaces.model.service.Scanner;

public class ConcreteScanner extends Device implements Scanner {
    public ConcreteScanner(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Scanner processing: " + doc);
    }

    public String scan(){
        return "Scanned content";
    }
}

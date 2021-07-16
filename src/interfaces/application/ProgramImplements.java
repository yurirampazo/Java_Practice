package interfaces.application;

import interfaces.model.entities.ComboDevice;
import interfaces.model.entities.ConcretePrinter;
import interfaces.model.entities.ConcreteScanner;

public class ProgramImplements {
    public static void main(String[] args) {

        ConcretePrinter p = new ConcretePrinter("8080");
        p.processDoc("My Letter");
        p.print("My Letter");

        System.out.println();

        ConcreteScanner s = new ConcreteScanner("9090");
        s.processDoc("My Email");
        System.out.println("Scan Result: " + s.scan());

        System.out.println();

        ComboDevice c = new ComboDevice("100100");
        c.processDoc("My vlog");
        c.print("My vlog");
        System.out.println("Scan result: " + s.scan());



    }
}

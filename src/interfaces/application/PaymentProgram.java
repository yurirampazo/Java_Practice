package interfaces.application;

import interfaces.model.entities.Contract;
import interfaces.model.entities.Installment;
import interfaces.model.service.ContractService;
import interfaces.model.service.OnlinePaymentService;
import interfaces.model.service.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class PaymentProgram {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter contract data: ");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Date: ");
        Date date = sdf.parse(sc.next());
        System.out.print("Contract value: ");
        double value = sc.nextDouble();
        System.out.print("Enter the number of installments: ");
        int INSTALLMENTS = sc.nextInt();
        System.out.println("-------------");
        System.out.println("Installments: ");

        Contract contract = new Contract(number,date, value);

        ContractService cs = new ContractService(new PaypalService());

        cs.ProcessContract(contract, INSTALLMENTS);

        for (Installment i : contract.getInstallments()) {
            System.out.println(i);
        }


        sc.close();
    }
}

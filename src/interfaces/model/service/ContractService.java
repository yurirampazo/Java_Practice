package interfaces.model.service;

import interfaces.model.entities.Contract;
import interfaces.model.entities.Installment;

import java.util.Calendar;
import java.util.Date;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService){
        this.onlinePaymentService = onlinePaymentService;
    }

    public void ProcessContract(Contract contrac, int months){
        double basicQuota = contrac.getTotalValue()/months;
        for (int i=1; i <= months; i++) {
            double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
            double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);

            Date dueDate = addMonths(contrac.getDate(), i);
            contrac.getInstallments().add(new Installment(dueDate, fullQuota));
        }
    }

    private Date addMonths(Date date, int N){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, N);

        return calendar.getTime();
    }
}

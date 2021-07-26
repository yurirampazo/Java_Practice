package genericassetmap.model.service;

public class BrazilianInterestService implements InterestService {

    private double interestRate;

    public BrazilianInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}

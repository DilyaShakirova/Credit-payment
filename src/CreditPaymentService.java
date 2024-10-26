public class CreditPaymentService {
    public double calculate(double creditAmount, double percent, int months) {
        double interestRate;
        double payment;
        interestRate = percent / (100 * 12);
        payment = creditAmount * ((interestRate * Math.pow(1 + interestRate, months)) / (Math.pow(1 + interestRate, months) - 1));
        return payment;
    }
}

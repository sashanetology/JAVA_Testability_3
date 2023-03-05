public class CreditPaymentService {
    public double calculate(double sum, double annualRate, double period) {
        double monthlyPay;
        double monthlyRate = annualRate / (100 * 12);
        monthlyPay = sum * (Math.pow((monthlyRate + 1), period) * monthlyRate / (Math.pow((monthlyRate + 1), period) - 1));
        return monthlyPay;
    }
}
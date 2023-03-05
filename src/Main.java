public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double sum = 1_000_000;
        double annualRate = 9.99;
        double period = 36;
        double payment = service.calculate(sum, annualRate, period);
        System.out.println(Math.round(payment));
    }
}
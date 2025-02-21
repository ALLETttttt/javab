package abstraction.task7;

public class PayPal extends PaymentMethod {
    @Override
    void processPayment(double amount) {
        System.out.printf("Payment method done with amount %s via Paypal%n", amount);
    }
}

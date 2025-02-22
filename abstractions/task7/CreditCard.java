package abstractions.task7;

public class CreditCard extends PaymentMethod {
    @Override
    void processPayment(double amount) {
        System.out.printf("Payment method done with amount %s via Credit Card%n", amount);
    }
}

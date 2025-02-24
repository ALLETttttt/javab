package polymorphism.task7;

public class PaypalPayment extends Payment {
    public PaypalPayment(double amount) {
        super(amount);
    }

    @Override
    void processPayment() {
        System.out.println("Processing PayPal payment for $" + amount);
    }
}

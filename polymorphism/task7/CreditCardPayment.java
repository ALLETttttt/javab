package polymorphism.task7;

public class CreditCardPayment extends Payment {
    public CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    void processPayment() {
        System.out.println("Processing credit card payment for $" + amount);
    }
}

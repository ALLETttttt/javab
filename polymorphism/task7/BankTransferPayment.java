package polymorphism.task7;

public class BankTransferPayment extends Payment {
    public BankTransferPayment(double amount) {
        super(amount);
    }

    @Override
    void processPayment() {
        System.out.println("Processing bank transfer payment for $" + amount);
    }
}

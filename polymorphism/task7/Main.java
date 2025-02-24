package polymorphism.task7;

public class Main {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment(100.00);
        payment1.processPayment();

        Payment payment2 = new PaypalPayment(75.50);
        payment2.processPayment();

        Payment payment3 = new BankTransferPayment(200.75);
        payment3.processPayment();

    }
}

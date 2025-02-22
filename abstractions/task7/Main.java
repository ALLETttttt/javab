package abstractions.task7;

public class Main {
    public static void main(String[] args) {
        PayPal payPal = new PayPal();
        CreditCard creditCard = new CreditCard();

        payPal.processPayment(500);
        creditCard.processPayment(3200);
    }
}

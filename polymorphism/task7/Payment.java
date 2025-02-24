package polymorphism.task7;

abstract public class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    abstract void processPayment();
}

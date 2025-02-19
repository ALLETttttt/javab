package access_modifiers;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    private void logTransaction(String message) {
        System.out.println("Transaction log: " + message);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            logTransaction("Deposit: $" + amount);
            System.out.println("Deposit successful. New balance: " + this.balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
}

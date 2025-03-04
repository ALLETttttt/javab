package encapsulation.task8;

public class BankAccount {
    private double accountBalance;
    private String holderName;

    public BankAccount(double accountBalance, String holderName) {
        this.accountBalance = accountBalance;
        this.holderName = holderName;
    }

    public void deposit(double newDeposit) {
        if (newDeposit > 0) {
            this.accountBalance += newDeposit;
            System.out.println("Deposit for "+ newDeposit + " was successful. Current account balance: " + accountBalance);
        } else {
            System.out.println("For deposit sum should be positive");
        }
    }

    public void withdraw(double amount) {
        if (this.accountBalance - amount > 0) {
            this.accountBalance -= amount;
            System.out.println("For amount: " + amount + " withdraw was successful.");
        } else {
            System.out.println("Not enough balance for withdraw.");
        }
        System.out.println("Current account balance: " + accountBalance);
    }

    public double getAccountBalance() {
        return accountBalance;
    }
}

package encapsulation.task8;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(500.0, "Arthur");
        bankAccount.deposit(200);
        bankAccount.withdraw(150);

        bankAccount.withdraw(600);
    }
}

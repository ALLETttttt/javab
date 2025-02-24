package polymorphism.task3;

public class Main {
    public static void main(String[] args) {
        Bank bank = new BankC();
        Bank bank1 = new BankA();
        Bank bank2 = new BankB();

        System.out.println(bank1.getInterestRate());
        System.out.println(bank2.getInterestRate());
        System.out.println(bank.getInterestRate());
    }
}

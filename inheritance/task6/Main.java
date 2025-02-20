package inheritance.task6;

public class Main {
    public static void main(String[] args) {
        Bank bank;

        bank = new CurrentBank();
        System.out.println(bank.getInterestRate());


        bank = new SavingsBank();
        System.out.println(bank.getInterestRate());

        bank = new InvestmentBank();
        System.out.println(bank.getInterestRate());
    }
}

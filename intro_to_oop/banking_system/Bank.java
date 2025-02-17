package intro_to_oop.banking_system;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<BankAccount> bankAccounts;

    public Bank() {
        this.bankAccounts = new ArrayList<>();
    }

    public void addBankAccount(BankAccount account) {
        this.bankAccounts.add(account);
    }

    public BankAccount getBankAccountByAccountNumber(String accountNumber) {
        return this.bankAccounts.stream()
                .filter(bankAccount -> bankAccount.getAccountNumber().equalsIgnoreCase(accountNumber))
                .findFirst().orElse(null);
    }

    public void getBankAccounts() {
        for (BankAccount bankAccount: this.bankAccounts) {
            bankAccount.displayInfo();
        }
    }
}

package arrays.one_dimensional;

import java.util.Map;
import java.util.Scanner;

public class TransactionMatcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bank transactions size: ");
        int n = scanner.nextInt();

        String[] bankTransactions = new String[n];
        for (int i = 0; i < n; i++) {
            bankTransactions[i] = scanner.next();
        }

        System.out.print("Sales System Transactions size: ");
        int k = scanner.nextInt();

        String[] salesSystemTransactions = new String[k];
        for (int i = 0; i < k; i++) {
            salesSystemTransactions[i] = scanner.next();
        }

        int matchedIndex = 0, unmatchedBankIndex = 0, unmatchedSalesIndex = 0;

        boolean[] salesMatched = new boolean[k];

        String[] matchingTransactions = new String[Math.min(n, k)];
        String[] unmatchedBankTransactions = new String[n];
        String[] unmatchedSalesTransactions = new String[k];

        for (int i = 0; i < n; i++) {

            boolean matched = false;
            for (int j = 0; j < k; j++) {

                if (bankTransactions[i].equals(salesSystemTransactions[j]) && !salesMatched[j]) {
                    matchingTransactions[matchedIndex++] = bankTransactions[i];
                    salesMatched[j] = true;
                    matched = true;
                    break;
                }
            }

            if (!matched) {
                unmatchedBankTransactions[unmatchedBankIndex++] = bankTransactions[i];
            }

        }

        for (int i = 0; i < k; i++) {
            if (!salesMatched[i]) {
                unmatchedSalesTransactions[unmatchedSalesIndex++] = salesSystemTransactions[i];
            }
        }

        // Display results
        System.out.print("Matching Transactions: ");
        printArray(matchingTransactions, matchedIndex);

        System.out.print("Unmatched Transactions from the Bank: ");
        printArray(unmatchedBankTransactions, unmatchedBankIndex);

        System.out.print("Unmatched Transactions from the Sales System: ");
        printArray(unmatchedSalesTransactions, unmatchedSalesIndex);

    }

    private static void printArray(String[] array, int length) {
        if (length == 0) {
            System.out.println("None");
        } else {
            for (int i = 0; i < length; i++) {
                System.out.print(array[i]);
                if (i < length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}

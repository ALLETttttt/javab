package collections.hashset;

import java.util.*;

public class FraudulentTransactionIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Transaction IDS: ");
        String[] transactionIDS = scanner.nextLine().split(" ");

        System.out.print("Fraudulent IDS: ");
        String[] fraudulentIDS = scanner.nextLine().split(" ");

        List<String> transactionList = new ArrayList<>(Arrays.asList(transactionIDS));
        Set<String> fraudulentSet = new HashSet<>(Arrays.asList(fraudulentIDS));
        Set<String> filteredSet = new HashSet<>();

        for (String element: transactionList) {
            if (fraudulentSet.contains(element)) {
                filteredSet.add(element);
            }
        }
        System.out.println(filteredSet);
    }
}

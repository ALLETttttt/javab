package collections.treemap;

import java.util.Scanner;
import java.util.TreeMap;

public class InventoryPriceTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, Double> treeMap = new TreeMap<>();
        while (true) {
            System.out.print("Enter operation: ");
            String op = scanner.next();

            if (op.equals("add") || op.equals("update")) {
                System.out.print("Product: ");
                String product = scanner.next();

                System.out.print("Price: ");
                double price = scanner.nextDouble();

                treeMap.put(product, price);
                System.out.printf("Product %s with price %s was added.%n", product, price);
            } else if (op.equals("check")) {
                System.out.print("Enter product for checking: ");
                String pr = scanner.next();

                System.out.println(treeMap.get(pr));
            } else {
                break;
            }
        }
    }
}

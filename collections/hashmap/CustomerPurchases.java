package collections.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class CustomerPurchases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> hashMap = new HashMap<>();
        while (true) {
            System.out.print("Customer: ");
            String customer = scanner.next();

            if (customer.equalsIgnoreCase("exit")) break;

            System.out.print("Purchase amount: ");
            int purchase = scanner.nextInt();


            hashMap.put(customer, hashMap.getOrDefault(customer, 0) + purchase);
            System.out.println(hashMap);
        }
    }
}
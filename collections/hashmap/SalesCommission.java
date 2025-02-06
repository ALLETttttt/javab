package collections.hashmap;

import java.util.*;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> hashMap = new HashMap<>();
        while (true) {
            System.out.print("Operation(Add sale -> add or enter Threshold -> threshold): ");
            String operation = scanner.next();

            if (operation.equals("add")) {
                System.out.print("Sales Person ID: ");
                String personID = scanner.next();

                System.out.print("Sales Amount: ");
                Integer amount = scanner.nextInt();

                hashMap.put(personID, hashMap.getOrDefault(personID, 0) + amount);
                System.out.println(hashMap);
            } else if (operation.equals("threshold")) {
                System.out.print("Threshold: ");
                int threshold = scanner.nextInt();

                List<String> list = new ArrayList<>();

                for (Map.Entry<String, Integer> map: hashMap.entrySet()) {
                    if (map.getValue() > threshold) {
                        list.add(map.getKey());
                    }
                }
                System.out.println(list);
            } else {
                break;
            }


        }
    }
}

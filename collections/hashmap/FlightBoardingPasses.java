package collections.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class FlightBoardingPasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> hashMap = new HashMap<>();
        while (true) {
            System.out.print("Action(add, retrieve, remove or exit): ");
            String operation = scanner.next();

            if (operation.equals("exit")) {
                break;
            } else {
                System.out.print("Ticket Number: ");
                String ticket = scanner.next();

                if (operation.equals("add")) {
                    System.out.print("Flight Number: ");
                    String flight = scanner.next();

                    hashMap.put(ticket, flight);
                    System.out.println("Ticket was added successfully.");
                } else {
                    if (hashMap.containsKey(ticket)) {
                        if (operation.equals("retrieve")) {
                            System.out.println(hashMap.get(ticket));
                        } else if (operation.equals("remove")) {
                            hashMap.remove(ticket);
                            System.out.printf("Ticket %s was deleted successfully.%n", ticket);
                        } else {
                            break;
                        }
                    } else {
                        System.out.println("Entered ticket does not exit.");
                    }
                }
            }
        }
    }
}

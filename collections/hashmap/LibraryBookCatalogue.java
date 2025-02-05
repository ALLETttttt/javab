package collections.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class LibraryBookCatalogue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] actions = {"Add", "Remove", "Lookup", "Exit"};
        HashMap<String, String> hashMap = new HashMap<>();

        while (true) {
            System.out.printf("1.Add %n2.Remove %n3.Lookup %n4.Exit %nEnter operation: ");
            int operation = scanner.nextInt();
            String selectedOperation = actions[operation-1];

            if (selectedOperation.equalsIgnoreCase("Add")) {
                System.out.print("ISBN: ");
                String isbn = scanner.next();

                System.out.print("Title: ");
                String title = scanner.next();

                hashMap.put(isbn, title);
            } else if (selectedOperation.equalsIgnoreCase("Remove")) {
                System.out.print("Enter ISBN of book: ");
                String isbn = scanner.next();
                if (hashMap.containsKey(isbn)) {
                    System.out.println("Book " + hashMap.get(isbn) + " was removed.");
                    hashMap.remove(isbn);
                } else {
                    System.out.println("Written ISBN does not exist.");
                }
            } else if (selectedOperation.equalsIgnoreCase("Lookup")) {
                System.out.print("Enter ISBN of book: ");
                String isbn = scanner.next();
                System.out.println(hashMap.getOrDefault(isbn, "Written ISBN does not exist."));
            } else {
                break;
            }
        }
    }
}

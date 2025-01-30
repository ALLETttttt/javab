package collections.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class FruitManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> fruits = new ArrayList<>();

        while (true) {
            System.out.print("Enter operation(add, list, remove, exit): ");
            String operation = scanner.next();

            if (Objects.equals(operation, "exit")) {
                break;
            }

            switch (operation) {
                case "add" -> {
                    System.out.print("Enter your fruit to add to your list: ");
                    String fruit = scanner.next();
                    fruits.add(fruit);
                    System.out.printf("Fruit - %s added successfully.%n", fruit);
                }
                case "remove" -> {
                    System.out.print("Enter your fruit to remove from the list: ");
                    String fruit = scanner.next();
                    if (fruits.contains(fruit)) {
                        fruits.remove(fruit);
                        System.out.printf("Fruit - %s removed successfully.%n", fruit);
                    } else {
                        System.out.println("Entered fruit does not exist on the list.");
                    }
                }
                case "list" -> {
                    System.out.println(fruits);
                }
                default -> {
                    System.out.println("Entered invalid operation");
                }
            }
        }
    }
}

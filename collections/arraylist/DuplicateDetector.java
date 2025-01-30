package collections.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            System.out.print("Enter number: ");
            numbers.add(scanner.nextInt());
        }

        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            for (int j = i+1; j < 7; j++) {
                if (numbers.get(i).equals(numbers.get(j)) && !duplicates.contains(numbers.get(i))) {
                    duplicates.add(numbers.get(i));
                }
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicates");
        } else {
            System.out.print("Duplicates: ");
            for (int num: duplicates) {
                System.out.print(num + " ");
            }
        }
    }
}

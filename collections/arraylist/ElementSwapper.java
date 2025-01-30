package collections.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElementSwapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            numbers.add(scanner.nextInt());
        }

        System.out.print("Enter you first position to swap: ");
        int firstPos = scanner.nextInt();

        System.out.print("Enter you second position to swap: ");
        int secondPos = scanner.nextInt();

        if (firstPos >= 0 && firstPos <= 4 && secondPos >= 0 && secondPos <= 4) {
            int first = numbers.get(firstPos);
            int second = numbers.get(secondPos);

            numbers.set(firstPos, second);
            numbers.set(secondPos, first);

            for (int num: numbers) {
                System.out.print(num + " ");
            }
        } else {
            System.out.print("Invalid positions.");
        }

    }
}

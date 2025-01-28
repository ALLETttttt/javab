package loops.cycle_for;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            System.out.print("Enter number: ");
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            if (number % 2 == 0) {
                System.out.printf("%d is even.%n", number);
            } else {
                System.out.printf("%d is odd.%n", number);
            }
        }
    }
}

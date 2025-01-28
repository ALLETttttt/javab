package loops.cycle_while;

import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println("Entered number should be positive.");
            return;
        }

        int counter = 0;
        System.out.print("Collatz Sequence: " + num + " ");
        while(num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            System.out.print(num + " ");
            counter++;
        }
        System.out.println();
        System.out.println("Number of steps to reach 1: " + counter);
    }
}

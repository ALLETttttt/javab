package loops.cycle_for;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");

        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println("Invalid input, negative one is not accepted.");
            return;
        }

        int sum = 0;
        for (; num > 0; num /= 10) {
            sum += num % 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}

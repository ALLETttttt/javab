package loops.cycle_for;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range for prime numbers: ");

        int range = scanner.nextInt();

        if (range == 0 || range == 1) {
            System.out.println("Invalid range.");
            return;
        }

        for (int i = 2; i < range; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}

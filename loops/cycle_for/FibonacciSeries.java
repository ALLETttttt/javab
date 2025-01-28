package loops.cycle_for;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the Fibonacci series: ");
        int fib = scanner.nextInt();

        if (fib <= 0) {
            System.out.println("Please Enter positive integer.");
            return;
        }
        int first = 0, second = 1;
        for (int i = 1; i <= fib; i++) {
            System.out.print(first + " ");
            int next = first + second;

            first = second;
            second = next;
        }
    }
}

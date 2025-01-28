package loops.cycle_for;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square: ");

        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.println("*".repeat(size));
        }
    }
}

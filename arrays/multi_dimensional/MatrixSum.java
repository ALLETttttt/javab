package arrays.multi_dimensional;

import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Size of matrix (N): ");
        int size = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("Enter element [%d][%d]: ", i, j);
                int number = scanner.nextInt();
                sum += number;
            }
        }

        System.out.println("The sum of the matrix elements is: " + sum + ".");

        scanner.close();
    }
}

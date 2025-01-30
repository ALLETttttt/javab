package arrays.multi_dimensional;

import java.util.Scanner;

public class AntiDiagonalElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = 4;
        int[][] arr = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("Enter element [%d][%d]: ", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Anti-Diagonal Elements: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i+j == size-1) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}

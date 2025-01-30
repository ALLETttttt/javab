package arrays.multi_dimensional;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Enter element [%d][%d]: ", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        int[][] transposedArray = new int[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                transposedArray[i][j] = arr[j][i];
            }
            System.out.println();
        }

        System.out.println("Original array: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transposed array: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(transposedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

package arrays.multi_dimensional;

import java.util.Scanner;

public class DiagonalElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Enter element [%d][%d]: ", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        System.out.print("Main Diagonal: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i][i]);
            if (i < 2) System.out.print(", ");
        }
        System.out.println();

        System.out.print("Secondary Diagonal: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i][2 - i]);
            if (i < 2) System.out.print(", ");
        }
        System.out.println();
    }
}

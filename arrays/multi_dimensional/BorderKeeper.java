package arrays.multi_dimensional;

import java.util.Scanner;

public class BorderKeeper {
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

        for (int j = 0; j < size; j ++) {
            System.out.print(arr[0][j] + " ");
        }

        for (int i = 1; i < size-1; i++) {
            System.out.print(arr[i][size-1] + " ");
        }

        for (int j = size-1; j >= 0; j--) {
            System.out.print(arr[size-1][j] + " ");
        }

        for (int i = size-2; i >= 1; i--) {
            System.out.print(arr[i][0] + " ");
        }

        scanner.close();


    }
}

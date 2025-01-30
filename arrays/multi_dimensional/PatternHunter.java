package arrays.multi_dimensional;

import java.util.Scanner;

public class PatternHunter {
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

        boolean isSymmetric = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i][j] != arr[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) break;
        }

        if (isSymmetric) {
            System.out.println("This matrix is symmetric");
        } else {
            System.out.println("This matrix is not symmetric");
        }
    }
}

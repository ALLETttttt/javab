package arrays.multi_dimensional;

public class MatrixMultiplication {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int[][] matrixA = new int[2][2];
        int[][] matrixB = new int[2][2];

        System.out.println("Enter matrix A elements:");
        inputMatrix(matrixA, scanner);

        System.out.println("\nEnter matrix B elements:");
        inputMatrix(matrixB, scanner);

        System.out.println("\nMatrix A:");
        printMatrix(matrixA);

        System.out.println("\nMatrix B:");
        printMatrix(matrixB);

        int[][] result = multiplyMatrices(matrixA, matrixB);

        System.out.println("\nResultant Matrix:");
        printMatrix(result);

        scanner.close();
    }

    private static void inputMatrix(int[][] matrix, java.util.Scanner scanner) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Enter element [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    private static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int[][] result = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return result;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
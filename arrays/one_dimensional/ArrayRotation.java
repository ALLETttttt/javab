package arrays.one_dimensional;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the rotation count: ");
        int k = scanner.nextInt();
        int[] rotatedArray = new int[n];

        k = k%n;
        for (int i = 0; i < k; i++) {
            rotatedArray[i] = array[n-k+i];
        }

        for (int i = 0; i < n-k; i++) {
            rotatedArray[k+i] = array[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(rotatedArray[i] + " ");
        }
    }
}

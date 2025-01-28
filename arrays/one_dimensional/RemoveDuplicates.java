package arrays.one_dimensional;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int[] unique = new int[n];
        int counter = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicated = false;

            for (int j = 0; j < counter; j++) {
                if (array[i] == unique[j]) {
                    isDuplicated = true;
                    break;
                }
            }

            if (!isDuplicated) {
                unique[counter] = array[i];
                counter++;
            }
        }

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < counter; i++) {
            System.out.print(unique[i] + " ");
        }
    }
}

package arrays.one_dimensional;

import java.util.Arrays;
import java.util.Scanner;


public class StringSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();

        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a string: ");
            array[i] = scanner.next();
        }

        Arrays.sort(array);

        System.out.print("Sorted arrays: ");
        for (String s: array) {
            System.out.print(s + ", ");
        }
    }
}

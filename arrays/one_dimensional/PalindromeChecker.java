package arrays.one_dimensional;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();

        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a string: ");
            array[i] = scanner.next();
        }

        System.out.print("Palindromes: ");
        for (int i = 0; i < n; i++) {
            if (isPalindrome(array[i])) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length()-1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

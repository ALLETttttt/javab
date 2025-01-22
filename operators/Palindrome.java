package operators;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.next().toLowerCase();

        boolean flag = false;

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                flag = true;
                break;
            }
            left++;
            right--;
        }
        if (flag) {
            System.out.printf("Given string %s is not palindrome", str);
            return;
        }
        System.out.printf("Given string %s is palindrome", str);
    }
}

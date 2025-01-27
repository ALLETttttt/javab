package loops.cycle_dowhile;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = scanner.nextLine().trim();

        if (password.length() < 8) {
            System.out.println();
            return;
        }

        boolean isDigit = false;
        boolean isUpper = false;
        boolean isLower = false;

        int i = 0;

        do {
            char c = password.charAt(i);

            if (Character.isDigit(c)) {
                isDigit = true;
            }

            if (Character.isLowerCase(c)) {
                isLower = true;
            }

            if (Character.isUpperCase(c)) {
                isUpper = true;
            }

            i++;
        } while (i < password.length());

        if (!isLower) {
            System.out.println("Password should contain at least one lowercase letter.");
        }

        if (!isDigit) {
            System.out.println("Password should contain at least one number.");
        }

        if (!isUpper) {
            System.out.println("Password should contain at least one uppercase letter.");
        }

        if (isLower && isDigit && isUpper) {
            System.out.println("Password accepted.");
        }

        scanner.close();
    }
}

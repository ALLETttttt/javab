package loops.cycle_for;

import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String str = scanner.nextLine().trim();
        StringBuilder modifiedStr = new StringBuilder(str);

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    modifiedStr.setCharAt(i, Character.toUpperCase(ch));
                else {
                    modifiedStr.setCharAt(i, Character.toLowerCase(ch));
                }
            }
        }
        System.out.println("Modified string: " + modifiedStr);
    }
}

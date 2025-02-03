package collections.hashset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NonRepeatedCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = scanner.next();

        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        for (char c: str.toCharArray()) {
            if (!seen.add(c)) {
                duplicates.add(c);
            }
        }

        for (char c: str.toCharArray()) {
            if (!duplicates.contains(c)) {
                System.out.println("'" + c + "'");
                return;
            }
        }
    }
}

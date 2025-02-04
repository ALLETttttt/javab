package collections.hashset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctSubstringCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("String: ");
        String str = scanner.next();

        System.out.print("n: ");
        int n = scanner.nextInt();

        Set<String> set = new HashSet<>();
        for (int i = 0; i <= str.length()-n; i++) {
            set.add(str.substring(i, i+n));
        }
        System.out.print(set.size() + " ");
        System.out.println(set);


    }
}

package collections.hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split(" ");

        Set<String> set = new HashSet<>(Arrays.asList(elements));

        System.out.println(set);
    }
}

package collections.hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetIntersection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Set1: ");
        String[] elements = scanner.nextLine().split(" ");
        Set<String> set = new HashSet<>(Arrays.asList(elements));
    }
}

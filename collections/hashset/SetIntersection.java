package collections.hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetIntersection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Set1: ");
        String[] firstSetElements = scanner.nextLine().split(" ");
        Set<String> firstSet = new HashSet<>(Arrays.asList(firstSetElements));

        System.out.print("Set2: ");
        String[] secondSetElements = scanner.nextLine().split(" ");
        Set<String> secondSet = new HashSet<>(Arrays.asList(secondSetElements));

        Set<String> filteredSet = new HashSet<>();
        for (String element: firstSet) {
            if (secondSet.contains(element)) {
                filteredSet.add(element);
            }
        }
        System.out.println(filteredSet);
    }
}

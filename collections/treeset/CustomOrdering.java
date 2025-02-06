package collections.treeset;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class CustomOrdering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(" ");

        TreeSet<String> treeSet = new TreeSet<>(Comparator.reverseOrder());
        treeSet.addAll(Arrays.asList(elements));

        System.out.println(treeSet);

    }
}

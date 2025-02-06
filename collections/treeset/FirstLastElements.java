package collections.treeset;

import java.util.Scanner;
import java.util.TreeSet;

public class FirstLastElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(" ");

        TreeSet<Integer> treeSet = new TreeSet<>();

        for (String str: elements) {
            treeSet.add(Integer.parseInt(str));
        }

        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());
    }
}

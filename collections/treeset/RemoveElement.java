package collections.treeset;

import java.util.Scanner;
import java.util.TreeSet;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(" ");

        TreeSet<Integer> treeSet = new TreeSet<>();

        for (String str: elements) {
            treeSet.add(Integer.parseInt(str));
        }

        System.out.print("Element to remove: ");
        int elementToRemove = scanner.nextInt();

        treeSet.remove(elementToRemove);

        System.out.println(treeSet);
    }
}

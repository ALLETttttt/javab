package collections.treeset;

import java.util.Scanner;
import java.util.TreeSet;

public class RetrieveTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(" ");

        TreeSet<Integer> treeSet = new TreeSet<>();

        for (String str: elements) {
            treeSet.add(Integer.parseInt(str));
        }

        System.out.print("Integer for ceiling and flooring: ");
        int num = scanner.nextInt();

        System.out.println("Ceiling: " + treeSet.ceiling(num));
        System.out.println("Flooring: " + treeSet.floor(num));
    }
}

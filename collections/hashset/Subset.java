package collections.hashset;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Subset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Set1: ");
        String[] firstInput = scanner.nextLine().split(" ");
        Set<Integer> set1 = new HashSet<>();

        for (String num: firstInput) {
            set1.add(Integer.parseInt(num));
        }

        System.out.print("Set2: ");
        String[] secondInput = scanner.nextLine().split(" ");
        Set<Integer> set2 = new HashSet<>();

        for (String num: secondInput) {
            set2.add(Integer.parseInt(num));
        }

        boolean target = true;
        for (int num: set1) {
            if (!set2.contains(num)) {
                target = false;
            }
        }

        System.out.println(target);
    }
}

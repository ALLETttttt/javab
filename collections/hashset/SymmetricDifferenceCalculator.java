package collections.hashset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SymmetricDifferenceCalculator {
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

        Set<Integer> result = new HashSet<>(set1);
        Set<Integer> temp = new HashSet<>(set2);
        result.removeAll(set2);
        temp.removeAll(set1);
        result.addAll(temp);
        System.out.println(result);
    }
}

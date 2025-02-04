package collections.hashset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PairGivenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split(" ");
        Set<Integer> set = new HashSet<>();

        System.out.print("Target sum: ");
        int target = scanner.nextInt();

        for (String element: elements) {
            set.add(Integer.parseInt(element));
        }

        System.out.println(hasPairWithSum(set, target));

    }

    public static boolean hasPairWithSum(Set<Integer> set, int target) {
        Set<Integer> complements = new HashSet<>();
        for (int num: set) {
            if (complements.contains(num)) {
                return true;
            }
            complements.add(target-num);
        }
        return false;
    }
}

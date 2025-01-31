package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArraylistIntersection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter elements for first array list: ");

        String[] firstElements = scanner.nextLine().split(" ");
        List<String> firstList = new ArrayList<>(Arrays.asList(firstElements));

        System.out.print("Enter elements for second array list: ");

        String[] secondElements = scanner.nextLine().split(" ");
        List<String> secondList = new ArrayList<>(Arrays.asList(secondElements));

        System.out.print("Intersection: ");
        for (String s : firstList) {
            for (String string : secondList) {
                if (s.equals(string)) {
                    System.out.print(s + " ");
                }
            }
        }

    }
}

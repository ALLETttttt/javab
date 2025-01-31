package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ElementFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter elements: ");
        String[] elements = scanner.nextLine().split(" ");

        List<String> list = new ArrayList<>(Arrays.asList(elements));
        List<String> counter = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String current = list.get(i);
            if (!counter.contains(current)) {
                int cnt = 0;
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j).equals(current)) {
                        cnt++;
                    }
                }
                counter.add(current);
                System.out.println(current + ": " + cnt);
            }
        }
    }
}

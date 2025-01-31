package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class MaxMinFinder {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(
                List.of(
                        1, 2, 1232, 432, 231, 12, 121, -1, 121, 31, -131
                )
        );

        int max = (int) -1e9, min = (int) 1e9;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }

        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);
    }
}

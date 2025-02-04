package collections.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fruitsList = scanner.nextLine().split(" ");

        HashMap<String, Integer> fruits = new HashMap<>();

        for (String fruit: fruitsList) {
            fruits.put(fruit, fruits.getOrDefault(fruit, 0) + 1);
        }

        System.out.println(fruits);
    }
}

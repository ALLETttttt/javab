package collections.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] list1 = scanner.nextLine().split(" ");
        String[] list2 = scanner.nextLine().split(" ");

        System.out.print(commonElements(list1, list2));
    }

    public static List<String> commonElements(String[] list1, String[] list2) {
        List<String> list = new ArrayList<>();

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String str: list1) {
            hashMap.put(str, hashMap.getOrDefault(str, 0) + 1);
        }

        for (String str: list2) {
            if (hashMap.getOrDefault(str, 0) > 0) {
                list.add(str);
            }
        }
        return list;
    }
}

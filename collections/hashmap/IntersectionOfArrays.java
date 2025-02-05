package collections.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Array1: ");
        String[] array1 = scanner.nextLine().split(" ");

        System.out.print("Array2: ");
        String[] array2 = scanner.nextLine().split(" ");

        System.out.println(intersectArrays(array1, array2));


    }

    public static List<Integer> intersectArrays(String[] num1, String[] num2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (String num : num1) {
            int k = Integer.parseInt(num);
            hashMap.put(k, hashMap.getOrDefault(k, 0) + 1);
        }

        for (String num : num2) {
            int k = Integer.parseInt(num);
            if (hashMap.getOrDefault(k, 0) > 0) {
                list.add(k);
                hashMap.put(k, hashMap.get(k) - 1);
            }
        }

        return list;
    }
}

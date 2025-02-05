package collections.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class NonRepeatedCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String strs = scanner.next();

        HashMap<Character, Integer> hashMap = new HashMap();

        for (char c: strs.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        for (char c: strs.toCharArray()) {
            if (hashMap.get(c) == 1) {
                System.out.println("'" + c + "'");
                return;
            }
        }
    }
}

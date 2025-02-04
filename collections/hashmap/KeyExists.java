package collections.hashmap;

import java.util.HashMap;

public class KeyExists {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "One");
        map1.put(2, "Two");
        map1.put(3, "Three");

        int key1 = 2;
        System.out.println(map1.containsKey(key1)); // Output: true

        // Example 2
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("A", "Alpha");
        map2.put("B", "Bravo");
        map2.put("C", "Charlie");

        String key2 = "D";
        System.out.println(map2.containsKey(key2));
    }
}

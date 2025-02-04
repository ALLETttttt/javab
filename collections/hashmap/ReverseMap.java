package collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ReverseMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "A");
        hashMap.put(2, "B");
        hashMap.put(3, "A");

        HashMap<String, Integer> reversedHashMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry: hashMap.entrySet()) {
            reversedHashMap.put(entry.getValue(), entry.getKey());
        }

        System.out.println(reversedHashMap);
    }
}

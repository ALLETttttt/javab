package collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MergeHashMaps {
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("a", "apple");
        map1.put("b", "banana");
        map1.put("c", "cherry");

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("b", "berry");
        map2.put("c", "cherry");

        for (Map.Entry<String, String> entry: map2.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            map1.merge(key, value, (oldValue, newValue) -> oldValue + newValue);
        }

        System.out.println(map1);
    }
}

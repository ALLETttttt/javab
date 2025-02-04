package collections.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValueLookup {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        String value = "Blue";

        hashMap.put(1, "Blue");
        hashMap.put(2, "Red");
        hashMap.put(3, "Green");
        hashMap.put(4, "Blue");
        hashMap.put(5, "Yellow");

        List<Integer> keyList = new ArrayList<>();
        for (Map.Entry<Integer, String> entry: hashMap.entrySet()) {
            if (value.equals(entry.getValue())) {
                keyList.add(entry.getKey());
            }
        }

        System.out.println(keyList);
    }
}

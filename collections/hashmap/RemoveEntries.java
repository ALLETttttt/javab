package collections.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RemoveEntries {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Apple");
        hashMap.put(4, "Cherry");

        String valueToRemove = "Apple";

        removeEntries(hashMap, valueToRemove);
        System.out.println(hashMap);
    }

    public static <I, S> void removeEntries(HashMap<I, S> map, S value) {
        Iterator<Map.Entry<I, S>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue().equals(value)) {
                iterator.remove();
            }
        }

    }
}

package collections.treemap;

import java.util.TreeMap;

public class InsertRetrieve {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple", 500);
        treeMap.put("Banana", 400);

        System.out.println(treeMap.get("Apple"));

        treeMap.put("Car", 30000);
        treeMap.put("Bike", 1500);

        System.out.println(treeMap.get("Car"));
    }
}

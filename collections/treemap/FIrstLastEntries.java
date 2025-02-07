package collections.treemap;

import java.util.TreeMap;

public class FIrstLastEntries {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>();

        treeMap.put("Dog", "Mammal");
        treeMap.put("Fish", "Aquatic");
        treeMap.put("Bird", "Aerial");

        /*
        Insert: "Dog", "Mammal"
        Insert: "Fish", "Aquatic"
        Insert: "Bird", "Aerial"
        Retrieve: First and Last
         */

        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastEntry());
    }
}

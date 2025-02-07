package collections.treemap;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class StudentGradeAnalyzer {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("Alice", 70);
        treeMap.put("Brian", 30);
        treeMap.put("Charlie", 90);

        Map.Entry<String, Integer> highest = Collections.max(treeMap.entrySet(), Map.Entry.comparingByValue());
        Map.Entry<String, Integer> lowest = Collections.min(treeMap.entrySet(), Map.Entry.comparingByValue());


        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
    }
}

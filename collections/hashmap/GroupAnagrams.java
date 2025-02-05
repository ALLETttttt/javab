package collections.hashmap;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split(" ");
        HashMap<String, List<String>> listHashMap = new HashMap<>();

        for (String word: elements) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            listHashMap.putIfAbsent(sorted, new ArrayList<>());
            listHashMap.get(sorted).add(word);
        }
        System.out.println(new ArrayList<>(listHashMap.values()));

    }
}

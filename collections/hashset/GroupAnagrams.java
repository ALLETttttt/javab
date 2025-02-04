package collections.hashset;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split(" ");

        List<Set<String>> setList = new ArrayList<>();
        Set<String> visited = new HashSet<>();

        for (String str: strings) {
            if (!visited.contains(str)) {
                Set<String> set = new HashSet<>();
                set.add(str);
                for (String word: strings) {
                    if (!str.equals(word) && isAnagram(str, word)) {
                        visited.add(word);
                        set.add(word);
                    }
                }
                visited.add(str);
                setList.add(set);
            }
        }

        System.out.println(setList);

    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }
}

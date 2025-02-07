package basic_file_operations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WordCounter {
    public static void main(String[] args) {
        TreeMap<String, Integer> hashMap = new TreeMap<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("sample.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word: words) {
                    word = word.toLowerCase();
                    hashMap.put(word, hashMap.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        for (Map.Entry<String, Integer> map: hashMap.entrySet()) {
            System.out.println(map.getKey() + ": " + map.getValue());
        }
    }
}

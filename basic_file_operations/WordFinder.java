package basic_file_operations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write word to search: ");
        String word = scanner.next();
        scanner.close();

        String file = "sample.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            int counter = 1;
            StringBuilder result = new StringBuilder();

            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(word)) {
                    if (!result.isEmpty()) {
                        result.append(", ");
                    }
                    result.append(counter);
                }
                counter++;
            }

            if (!result.isEmpty()) {
                System.out.printf("Word \"%s\" found on lines: %s%n", word, result);
            } else {
                System.out.printf("Word \"%s\" not found.%n", word);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

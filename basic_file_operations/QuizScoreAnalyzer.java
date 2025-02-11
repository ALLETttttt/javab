package basic_file_operations;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuizScoreAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rest = "Johny - 95";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(rest);
        if (matcher.find()) {
            System.out.println(matcher.group());
        }


        boolean exit = false;
        while (!exit) {
            System.out.println("== Quiz Score Analyzer ==");
            System.out.println("1. Write students results.");
            System.out.println("2. Show class average.");
            System.out.println("3. Exit.");
            System.out.print("Enter your choice (1-3): ");

            String choice = scanner.next();

            switch (choice) {
                case "1" -> writeClassResults(scanner);
                case "2" -> showAverageResults(scanner);
                case "3" -> exit = true;
                default -> System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
        }
    }

    public static void writeClassResults(Scanner scanner) {
        System.out.print("Enter file name: ");
        scanner.nextLine();
        String filename = scanner.nextLine().trim() + ".txt";

        File file = new File(filename);
        StringBuilder stringBuilder = new StringBuilder();

        System.out.println("Students (enter END to stop): ");

        while (true) {
            String students = scanner.nextLine().trim();
            if (students.equalsIgnoreCase("END")) {
                break;
            }
            stringBuilder.append(students).append(System.lineSeparator());
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write(stringBuilder.toString());
        } catch (IOException e) {
            System.out.println("Error writing the file: " + e.getMessage());
        }
    }

    public static void showAverageResults(Scanner scanner) {
        System.out.print("Enter your file name: ");
        String filename = scanner.next().trim() + ".txt";
        File file = new File(filename);

        if (!file.exists()) {
            System.out.println("Entered file does not exist.");
            return;
        }


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            HashMap <String, Integer> hashMap = new HashMap<>();
            String line;
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                Pattern pattern = Pattern.compile("\\d+");
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    String[] data = line.split("-");
                    int score = Integer.parseInt(matcher.group());
                    sum += score;
                    hashMap.put(data[0].trim(), score);
                }
            }

            double average = (double) sum / hashMap.size();
            System.out.println("Class average: " + average);

            List<String> belowAverageStudents = new ArrayList<>();
            System.out.print("Students below average: ");
            for (Map.Entry<String, Integer> map: hashMap.entrySet()) {
                if (map.getValue() < average) {
                    belowAverageStudents.add(map.getKey());
                }
            }
            if (!belowAverageStudents.isEmpty()) {
                System.out.println("Students below average: " + String.join(", ", belowAverageStudents));
            } else {
                System.out.println("No students scored below average.");
            }
        } catch (IOException e) {
            System.out.println("Error reading the file " + e.getMessage());
        }
    }
}

package basic_file_operations;


import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ExpenseTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean flag = false;

        while (!flag) {
            System.out.println("=== Expense Tracker Menu ===");
            System.out.println("1. Write an expense");
            System.out.println("2. Read an expense");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> writeExpense(scanner);
                case "2" -> readExpense(scanner);
                case "3" -> flag = true;
                default -> System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
        }

    }

    public static void writeExpense(Scanner scanner) {
        System.out.print("Enter the date (yyyy-MM-dd): ");
        String dateStr = scanner.nextLine();

        LocalDate localDate;
        try {
            localDate = LocalDate.parse(dateStr, DateTimeFormatter.ISO_LOCAL_DATE);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
            return;
        }

        String filename = localDate + ".txt";
        File file = new File(filename);

        String mode = "overwrite";
        if (file.exists()) {
            System.out.println("An entry already exists for " + dateStr + ".");
            System.out.print("Do you want to overwrite (O) or append (A) the entry? ");
            String option = scanner.next();
            if (option.equalsIgnoreCase("O")) {
                mode = "overwrite";
            } else if (option.equalsIgnoreCase("A")) {
                mode = "append";
            } else {
                System.out.println("Invalid option. Operation canceled.");
                return;
            }
        }

        System.out.println("Enter your journal expense (type 'END' on a new line to finish):");
        StringBuilder entryBuilder = new StringBuilder();
        while (true) {
            String entry = scanner.nextLine();
            if (entry.equals("END")) {
                break;
            }
            entryBuilder.append(entry).append(System.lineSeparator());
        }

        String entries = entryBuilder.toString();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, mode.equals("append")))) {
            bufferedWriter.write(entries);
            System.out.println("Expenses saved successfully.");
        } catch (IOException e) {
            System.out.println("Error writing the file: " + e.getMessage());
        }
    }

    public static void readExpense(Scanner scanner) {
        System.out.println("Enter the date (yyyy-MM-dd): ");
        String dateStr = scanner.next();

        LocalDate localDate;
        try {
            localDate = LocalDate.parse(dateStr, DateTimeFormatter.ISO_LOCAL_DATE);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
            return;
        }

        String filename = dateStr + ".txt";
        File file = new File(filename);

        if (!file.exists()) {
            System.out.println("No entry found for " + dateStr + ".");
            return;
        }

        System.out.println("Entry for " + dateStr + ":");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("$")) {
                    sum += Integer.parseInt(line.substring(1));
                }
                System.out.println(line);
            }
            System.out.println("Total: " + sum);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

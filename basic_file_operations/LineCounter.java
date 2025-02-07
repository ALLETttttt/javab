package basic_file_operations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LineCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File name for counting lines: ");
        String filename = scanner.next();

        File file = new File(filename);

        if (file.exists()) {
            try {
                FileReader fileReader = new FileReader(file.getName());
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line;
                int counter = 0;

                System.out.println("Content of " + file.getName() + ":");
                while ((line = bufferedReader.readLine()) != null) {
                    if (!line.isEmpty()) {
                        System.out.println(line);
                        counter++;
                    }
                }
                System.out.printf("File %s has %d lines.", file.getName(), counter);
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Entered file does not exist.");
        }
    }
}

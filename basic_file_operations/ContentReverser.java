package basic_file_operations;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ContentReverser {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("sample.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt"));) {

            for (int i = list.size()-1; i >= 0; i--) {
                bufferedWriter.write(list.get(i));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing the file: " + e.getMessage());
        }
    }
}

package try_catch_finally;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FinallyBlock {
    public static void main(String[] args) {
        String filename = "task.txt";

        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filename);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error the reading file " + e.getMessage());
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                System.out.println("Error: Unable to close resources.");
            }
        }
    }
}

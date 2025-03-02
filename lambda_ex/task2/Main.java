package lambda_ex.task2;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String path = "/Users/bakdaulet/IdeaProjects/JavaB";

        File directory = new File(path);

        if (directory.isDirectory()) {
            File[] txtFiles = directory.listFiles(file -> file.isFile() && file.getName().endsWith(".txt"));
            if (txtFiles != null && txtFiles.length > 0) {
                System.out.println("Files with .txt ending: ");
                for (File file : txtFiles) {
                    System.out.println(file.getName());
                }
            } else {
                System.out.println("There no file with .txt ending.");
            }
        } else {
            System.out.println("Given path is not directory.");
        }
    }
}

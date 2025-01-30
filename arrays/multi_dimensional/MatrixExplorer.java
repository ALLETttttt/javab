package arrays.multi_dimensional;

import java.util.Scanner;

public class MatrixExplorer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student amount: ");
        int students = scanner.nextInt();

        System.out.print("Enter subject amount: ");
        int subjects = scanner.nextInt();

        int[][] scores = new int[students][subjects];

        int topStudent = 0;
        double highestAvg = 0;
        for (int i = 0; i < students; i++) {
            int sum = 0;
            System.out.printf("Enter scores for student [%d]: %n", i+1);
            for (int j = 0; j < subjects; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                scores[i][j] += scanner.nextInt();
                sum += scores[i][j];
            }
            double avg = (double) sum / subjects;

            if (avg > highestAvg) {
                highestAvg = avg;
                topStudent = i + 1;
            }
        }

        scanner.close();

        System.out.printf("Student %s has the highest average score of %s", topStudent, highestAvg);
    }
}

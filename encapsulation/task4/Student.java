package encapsulation.task4;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String age;
    private List<Integer> grades;

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            System.out.println("Invalid grade. Must be between 0 and 100.");
        }
    }

    public void displayStudentInfo() {
        System.out.println("Student: " + name + ", Age: " + age);
        System.out.println("Grades: " + grades);
        System.out.printf("Average Grade: %.2f\n", calculateAverage());
    }

    public double calculateAverage() {
        return grades.stream()
                .mapToDouble(n -> n)
                .average()
                .orElse(0);
    }
}

package encapsulation.task4;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alex", "33");

        student.addGrade(66);
        student.addGrade(23);
        student.addGrade(97);

        System.out.println(student.calculateAverage());

        student.displayStudentInfo();
    }
}

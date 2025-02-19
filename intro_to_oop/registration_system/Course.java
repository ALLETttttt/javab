package intro_to_oop.registration_system;

import java.util.ArrayList;
import java.util.List;

public class Course {
    String courseId;
    String courseName;
    int capacity;
    List<Student> students;

    public Course(String courseId, String courseName, int capacity) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.capacity = capacity;
        this.students = new ArrayList<>();
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void displayInfo() {
        System.out.println("Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", capacity=" + capacity +
                '}');
    }

    public boolean isCourseAvailable() {
        return this.students.size() < this.capacity;
    }

    public boolean enrollStudentToCourse(Student student) {
        if (isCourseAvailable()) {
            this.students.add(student);
            return true;
        }
        return false;
    }
}

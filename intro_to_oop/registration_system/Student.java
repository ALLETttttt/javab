package intro_to_oop.registration_system;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String studentId;
    String name;
    List<Course> courses;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getEnrolledCourses() {
        System.out.println("Student: " + this.name);
        System.out.println("Enrolled Courses: ");
        if (this.courses.isEmpty()) {
            System.out.println("No courses yet.");
        } else {
            for (Course course: this.courses) {
                course.displayInfo();
            }
        }
    }

    public void enrollToCourse(Course course) {
        if (course.isCourseAvailable() && course.enrollStudentToCourse(this)) {
            courses.add(course);
            System.out.println(name + " successfully enrolled in " + course.getCourseName());
        } else {
            System.out.println("Enrollment failed: " + course.getCourseName() + " is full.");
        }
    }
}

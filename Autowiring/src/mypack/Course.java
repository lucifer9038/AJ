package mypack;

public class Course {

    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void displayCourseInfo() {
        System.out.println("Course: " + courseName);
    }
}

package mypack;

public class Student {

    private String studentName;
    private Course course;  // Autowired Course

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void displayStudentInfo() {
        System.out.println("Student: " + studentName);
        course.displayCourseInfo();
    }
}

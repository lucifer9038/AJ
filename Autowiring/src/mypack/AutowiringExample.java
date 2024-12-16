package mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringExample {

    public static void main(String[] args) {
        // Load the Spring context (XML configuration)
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Get the Student Bean from the Spring container
        Student student = (Student) context.getBean("student");

        // Display student and course details
        student.displayStudentInfo();

        // Close the context to release resources (optional)
        ((ClassPathXmlApplicationContext) context).close();
    }
}

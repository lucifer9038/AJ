package mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        MyService service = context.getBean("myService", MyService.class);

        try {
            service.performOperation();
        } catch (Exception e) {
            System.out.println("Exception caught in MainApp: " + e.getMessage());
        }
    }
}


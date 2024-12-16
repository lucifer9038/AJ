package mypack;

public class MyService {
    public void performOperation() {
        System.out.println("Performing operation...");
        throw new RuntimeException("Something went wrong!");
    }
}

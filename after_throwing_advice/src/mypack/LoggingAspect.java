package mypack;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

    @AfterThrowing(pointcut = "execution(* mypack.MyService.performOperation(..))", throwing = "ex")
    public void logException(RuntimeException ex) {
        System.out.println("LoggingAspect: Exception caught: " + ex.getMessage());
    }
}

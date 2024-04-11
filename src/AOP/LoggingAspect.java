package AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(public String getName())")
    public void LoggingAdvisory(){
        System.out.println("Advisory : getName method is called");
    }
}

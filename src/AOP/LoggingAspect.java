package AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution( * AOP.*.get*(..))")
    private void LoggingAdvisory(){
        System.out.println("Advisory : get method is called");
    }
}

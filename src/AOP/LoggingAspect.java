package AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("allMethods() && allgetter()")
    public void LoggingAdvisory(){
        System.out.println("Advisory : get method is called");
    }

    @Before("allgetter()")
    public void AnotherLoggingAdvisory(){
        System.out.println("some advisory");
    }

    @Pointcut("execution(* AOP.*.get*(..))")
    public void allgetter(){}

    @Pointcut("within(AOP.Circle)")
    public void allMethods(){}


}

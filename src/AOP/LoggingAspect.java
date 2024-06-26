package AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

public class LoggingAspect {

    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint){
    Object object = null;
        try{
            System.out.println("Before running");
        object = proceedingJoinPoint.proceed();
            System.out.println("After running");

        }catch (Throwable e){
            System.out.println("After throwing");
        }
        System.out.println("After finally");
        return object;
    }

    public void testProxy(){
        System.out.println("inside aspect");
    }


//    @Pointcut("within(AOP.Circle)")
//    public void allMethods(){}
//    @Before("allgetter()")
//    public void LoggingAdvisory(JoinPoint joinPoint){
//        Circle circle = (Circle) joinPoint.getTarget();
//        System.out.println("Advisory : get method is called");
//    }


//    @AfterReturning(pointcut="args(name)" , returning="returnString")
//    public void argsofMethod(String name, String returnString){
//        System.out.println("arg input is "+ name+ " output is "+ returnString);
//    }
//    @AfterThrowing(pointcut="args(name)" , throwing="ex")
//    public void throwsarg(String name, RuntimeException ex){
//        System.out.println("Exception "+ ex);
//    }


//    @Before("allgetter()")
//    public void AnotherLoggingAdvisory(){
//        System.out.println("some advisory");
//    }
//

}

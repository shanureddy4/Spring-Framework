package AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("AOP/spring.xml");
//        ShapeService service = ctx.getBean("shapeService",ShapeService.class);
//        service.getCircle().setNameReturn("round circle");
//        service.getCircle().setNameThrows("icecream");
       // System.out.println(service.getCircle().getName());

        FactoryService fs = new FactoryService();
        ShapeService shapeService = (ShapeService) fs.getBean("shapeService");
        shapeService.getCircle();

    }
}

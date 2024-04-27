package AOP;

public class FactoryService {

    public Object getBean(String beanType){
    if(beanType.equalsIgnoreCase("shapeService")) return new ShapeServiceProxy();
    if(beanType.equalsIgnoreCase("circle")) return new Circle();
    if(beanType.equalsIgnoreCase("triangle")) return new Triangle();
    return null;
    }
}

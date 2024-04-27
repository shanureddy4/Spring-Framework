package AOP;

public class ShapeServiceProxy extends ShapeService{
    @Override
    public Circle getCircle() {
        LoggingAspect loggingAspect = new LoggingAspect();
        loggingAspect.testProxy();
        return super.getCircle();
    }
}

package AOP;

public class ShapeService {
    private Circle circle;
    private Triangle triangle;

    public Circle getCircle() {
        System.out.println("Circle is returned");
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }
}

package AOP;

public class Circle {
    private String name;

    @Logging
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Name is "+ name);
    }
    public String setNameReturn(String name) {
        this.name = name;
        return "adding something to "+name;
    }
    public void setNameThrows(String name) {
        throw (new RuntimeException("error in circle"));
    }
}

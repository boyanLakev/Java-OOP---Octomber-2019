package shapes;

public class Main {
    public static void main(String[] args) {
        Shape r=new Rectangle(6,7);
        Shape c=new Circle(6);
        System.out.println(r.calculateArea());
        System.out.println(r.calculatePerimeter());
        System.out.println(c.calculateArea());
        System.out.println(c.calculatePerimeter());
    }
}

package shapes;

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
       double perimeter=radius*Math.PI;
       super.setPerimeter(perimeter);
        return perimeter;
    }

    @Override
    public double calculateArea() {
        double area=radius*radius*Math.PI;
        super.setArea(area);
        return area;
    }
}

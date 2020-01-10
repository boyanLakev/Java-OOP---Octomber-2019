package shapes;

public class Rectangle extends Shape {
    double weight;
    double heigh;

    public Rectangle(double weight, double heigh) {
        this.weight = weight;
        this.heigh = heigh;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter =2*this.weight+2*this.heigh;
        super.setPerimeter(perimeter);
        return perimeter;
    }

    @Override
    public double calculateArea() {
        double area = this.weight*this.heigh;
        super.setArea(area);
        return area;
    }
}

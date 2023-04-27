public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "blue";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }
    public Circle(double radius,String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI * (radius*radius);
    }

    public String toString() {
        return "Circle: radius = " + this.radius + " color = " + this.color;
    }
}
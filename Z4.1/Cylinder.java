public class Cylinder extends Circle {
    private double height;
    private double radius;

    public Cylinder() {
        this.radius = 5;
        this.height = 3;
    }
    public Cylinder(double radius) {
        super(radius);
        this.height = 3;
    }
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double volume() {
        return getArea() * height;
    }
}

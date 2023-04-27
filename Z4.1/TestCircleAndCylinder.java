import java.sql.SQLOutput;

public class TestCircleAndCylinder {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle toString(): " + circle.toString());

        Cylinder cylinder = new Cylinder( 7);
        System.out.println("");
        System.out.println("Cylinder volume: " + cylinder.volume());
        System.out.println("Cylinder height: " + cylinder.getHeight());
        System.out.println("Cylinder radius: " + cylinder.getRadius());
        System.out.println("Cylinder area: " + cylinder.getArea());
        System.out.println("Cylinder toString: " + cylinder.toString());
        Cylinder cylinder2 = new Cylinder( );
        System.out.println("");
        System.out.println("Cylinder volume: " + cylinder2.volume());
        System.out.println("Cylinder height: " + cylinder2.getHeight());
        System.out.println("Cylinder radius: " + cylinder2.getRadius());
        System.out.println("Cylinder area: " + cylinder2.getArea());
        System.out.println("Cylinder toString: " + cylinder2.toString());
    }
}
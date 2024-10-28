package cylinder;

public class Circle {

    // Instance variable
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = (radius < 0) ? 0 : radius;
    }

    // Method to get the radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate the area
    public double getArea() {
        return radius * radius * Math.PI; // Area = π * r²
    }
}

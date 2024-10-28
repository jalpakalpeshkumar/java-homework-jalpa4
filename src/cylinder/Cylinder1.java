package cylinder;

public class Cylinder1 extends Circle {

    // Instance variable
    private double height;

    // Constructor
    public Cylinder1(double radius, double height) {
        super(radius); // Call the parent constructor
        this.height = (height < 0) ? 0 : height;
    }

    // Method to get the height
    public double getHeight() {
        return height;
    }

    // Method to calculate the volume
    public double getVolume() {
        return getArea() * height; // Volume = Area of base * height
    }
}

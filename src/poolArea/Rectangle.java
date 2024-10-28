package poolArea;

/**
 * Holds width and length as private fields.
 * Constructor initializes these fields, ensuring non-negative values.
 * Provides methods to get the width, length, and area.
 */

public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }
}

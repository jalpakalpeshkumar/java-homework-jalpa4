package carpetcostcalculator;

/**
 * Has two private fields: width and length.
 * The constructor initializes these fields, setting them to 0 if negative.
 * The getArea method calculates and returns the area of the floor.
 */

public class Floor {

    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    public double getArea() {
        return width * length;
    }
}

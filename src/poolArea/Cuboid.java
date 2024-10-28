package poolArea;

/**
 * Extends Rectangle, adding a height field.
 * Its constructor calls the parent constructor and initializes height, also ensuring it’s non-negative.
 * Provides methods to get height and calculate volume.
 */

public class Cuboid extends Rectangle {

    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = (height < 0) ? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}

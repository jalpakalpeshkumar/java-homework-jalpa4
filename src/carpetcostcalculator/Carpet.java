package carpetcostcalculator;

/**
 * Has one private field: cost.
 * The constructor initializes this field, setting it to 0 if negative.
 * The getCost method returns the cost of the carpet.
 */

public class Carpet {

    private double cost;

    public Carpet(double cost) {
        this.cost = (cost < 0) ? 0 : cost;
    }

    public double getCost() {
        return cost;
    }
}

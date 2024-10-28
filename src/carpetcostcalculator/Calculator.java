package carpetcostcalculator;

/**
 * Has two private fields: floor (of type Floor) and carpet (of type Carpet).
 * The constructor initializes these fields.
 * The getTotalCost method calculates the total cost of carpeting by multiplying the area of the floor by the cost of the carpet.
 */

public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}

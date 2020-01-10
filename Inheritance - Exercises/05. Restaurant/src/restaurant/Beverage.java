package restaurant;

import java.math.BigDecimal;

public abstract class Beverage extends Product {
    private double milliliters;

    public Beverage(String name, BigDecimal price,double milliliters) {
        super(name, price);
        this.milliliters=milliliters;

    }

    public double getMililiters() {
        return milliliters;
    }

    public void setMililiters(double milliliters) {
        this.milliliters = milliliters;
    }
}

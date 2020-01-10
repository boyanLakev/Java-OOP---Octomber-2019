package restaurant;

import java.math.BigDecimal;

public abstract class HotBeverage extends Beverage {

    public HotBeverage(String name, BigDecimal price, double mililiters) {
        super(name, price, mililiters);
    }
}

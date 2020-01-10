package restaurant;

import java.math.BigDecimal;

public abstract class ColdBeverage extends Beverage {

    public ColdBeverage(String name, BigDecimal price, double mililiters) {
        super(name, price, mililiters);
    }
}

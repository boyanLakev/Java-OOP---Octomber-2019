package pizza;

import enums.ToppingType;
import utils.ValidatorUtil;

public class Topping  {
    private double weight;
    private String toppingType;

    public Topping( String toppingType,double weight) {

        this.setToppingType(toppingType);
            this.setWeight(weight);
        ValidatorUtil.validatToppingWeight(weight, toppingType);
    }

    private void setWeight(double weight) {
        this.weight = weight;
    }

    private String getToppingType() {
        return toppingType;
    }

    public double getWeight() {
        return weight;
    }



    private void setToppingType(String toppingType) {
        try {
             ToppingType.valueOf(toppingType.toUpperCase());
            this.toppingType =toppingType;
        } catch (IllegalArgumentException ex) {
            throw new IllegalArgumentException(
                    "Cannot place " + toppingType + " on top of your pizza.");
        }
    }

    public double calculateCalories() {
        double calories = this.weight*2;
        calories *= ToppingType.valueOf(this.toppingType).getModifier();

        return calories;
    }
}

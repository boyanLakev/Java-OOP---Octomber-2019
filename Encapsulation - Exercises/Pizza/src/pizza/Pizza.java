package pizza;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
       this.setName(name);
       this.setTopping(numberOfToppings);
    }



    private void setName(String name) {
        if(name==null ||
                (name.trim().length()<1&&name.trim().length()>15)){
            throw new IllegalArgumentException(
                    "Pizza name should be between 1 and 15 symbols.");
        }
        this.name=name;
    }

    private void setTopping(int numberOfToppings) {
        if (numberOfToppings<0 || numberOfToppings>10){
            throw new IllegalArgumentException(
                    "Number of toppings should be in range [0..10].");
        }
        this.toppings=new ArrayList<>(numberOfToppings);
    }


    public void setDough(Dough dough) {
        this.dough=dough;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public String getName() {
        return this.name;
    }

    public Dough getDough() {
        return this.dough;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }
    public double getOverallCalories (){
        return this.dough.calculateCalories()+
                this.toppings.stream()
                .mapToDouble(t->t.calculateCalories())
                .sum();
    }
    @Override
    public String toString() {
        return String.format("%s - %.2f",this.name,this.getOverallCalories());
    }
}

package models;

import exeptions.ArgumentExeption;
import helpers.Validator;
import models.interfaces.Speed;

import java.util.Objects;

public abstract class Boat implements Comparable<Boat>, Speed {
    private static final int MIN_MODEL_LENGTH = 5;
    private String model;
    private int weight;

    public Boat(String model, int weight) throws ArgumentExeption {
        this.setModel(model);
        this.setWeight(weight);
        ;

    }

    public int getWeight() {
        return weight;
    }

    protected void setWeight(int weight)  throws ArgumentExeption {
        if (Validator.validateParam(weight)) {
            this.weight = weight;
        } else {
            throw new ArgumentExeption(this.generatErrorMessage("Weight"));
        }
    }

    protected  String generatErrorMessage(String Param){
        return Param+" must be a positive integer.";
    }

    protected void setModel(String model) throws ArgumentExeption {
        if (Validator.validateModel(model)) {
            this.model = model;
        } else {
            throw new ArgumentExeption("Model's name must be at least "
                    + MIN_MODEL_LENGTH
                    + " symbols long.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null ||
                this.getClass().getSuperclass() != o.getClass().getSuperclass())
            return false;
        Boat boat = (Boat) o;
        return model.equals(boat.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }

    @Override
    public int compareTo(Boat o) {
        return this.model.compareTo(o.model);
    }
}

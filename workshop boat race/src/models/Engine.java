package models;

import exeptions.ArgumentExeption;
import helpers.Validator;
import models.interfaces.Output;

public abstract class Engine implements Comparable<Engine>, Output {
    private String model;
    private int horsepower;
    private int displacement;

    public Engine(String model, int horsepower, int displacement)  throws ArgumentExeption {
        this.setModel(model);
        this.setHorsepower(horsepower);
        this.setDisplacement(displacement);
    }

    public void setModel(String model) throws ArgumentExeption {
        if (Validator.validatorEngine(model)) {
            this.model = model;
        } else {
            throw new ArgumentExeption("Model's name must be at least 3 symbols long.");
        }
    }

    public void setHorsepower(int horsepower) throws ArgumentExeption {
        if (Validator.validateParam(horsepower)) {

            this.horsepower = horsepower;
        } else {
            throw new ArgumentExeption("Horsepower must be a positive integer.");
        }
    }

    public void setDisplacement(int displacement) throws ArgumentExeption {
        if (Validator.validateParam(displacement)) {
            this.displacement = displacement;
        }else {
            throw new ArgumentExeption("Displacement must be a positive integer.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null ||
                getClass().getSuperclass() != o.getClass().getSuperclass())
            return false;

        Engine engine = (Engine) o;

        return model.equals(engine.model);
    }

    @Override
    public int hashCode() {
        return model.hashCode();
    }

    @Override
    public int compareTo(Engine o) {
        return this.model.compareTo(o.model);
    }

    protected int getHorsepower() {
        return this.horsepower;
    }

    protected int getDisplacement() {
        return this.displacement;
    }
}

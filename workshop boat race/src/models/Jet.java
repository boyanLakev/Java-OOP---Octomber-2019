package models;

import exeptions.ArgumentExeption;

public class Jet extends Engine {
    public Jet(String model, int horsepower, int displacement) throws ArgumentExeption {
        super(model, horsepower, displacement);
    }

    @Override
    public int getOutput() {
        return getHorsepower()*7+getDisplacement();
    }
}

package models;

import exeptions.ArgumentExeption;

public class Sterndrive extends Engine {
    public Sterndrive(String model, int horsepower, int displacement) throws ArgumentExeption {
        super(model, horsepower, displacement);
    }

    @Override
    public int getOutput() {
        return getHorsepower()*5+getDisplacement();
    }
}

package models;

import exeptions.ArgumentExeption;
import helpers.Validator;

public class RowBoat extends Boat {
    private int oars;
    public RowBoat(String model, int weight,int oars) throws ArgumentExeption {
        super(model, weight);
        this.setOars(oars);

    }

    private void setOars(int oars) throws ArgumentExeption {
        if(Validator.validateParam(oars)){
            this.oars=oars;
        }else {
            throw new ArgumentExeption(this.generatErrorMessage("Oars"));
        }
    }

    @Override
    public double calcSpeed(Race race) {
        return (this.oars * 100) - getWeight() + race.getCurrentSpeed();
    }
}

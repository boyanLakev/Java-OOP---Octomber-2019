package models;

import exeptions.ArgumentExeption;

public class SailBoat extends Boat {
    private int sailEfficiency;
    public SailBoat(String model, int weight,int sailEfficiency) throws ArgumentExeption {
        super(model, weight);
        this.setSailEfficiency(sailEfficiency);
    }

    private void setSailEfficiency(int sailEfficiency) throws ArgumentExeption {
        if(sailEfficiency>0 && sailEfficiency<101){
            this.sailEfficiency=sailEfficiency;
        }else {
            throw new ArgumentExeption("Sail Effectiveness must be between [1...100].");

        }

    }

    @Override
    public double calcSpeed(Race race) {
        return (1 * (this.sailEfficiency / 100))
                - this.getWeight() + (race.getCurrentSpeed() / 2.0) ;
    }
}

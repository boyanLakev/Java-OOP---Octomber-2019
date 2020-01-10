package models;

import exeptions.ArgumentExeption;
import models.interfaces.Output;

public class PowerBoat extends Boat {
    private Engine primaryEngine;
    private Engine secondaryEngine;

    public PowerBoat(String model, int weight,Engine primaryEngine,Engine secondaryEngine) throws ArgumentExeption {
        super(model, weight);
        this.primaryEngine=primaryEngine;
        this.secondaryEngine=secondaryEngine;

    }

    @Override
    public double calcSpeed(Race race) {
        return (this.primaryEngine.getOutput() + this.secondaryEngine.getOutput())
                - this.getWeight()
                + (race.getCurrentSpeed() / 5.00);
    }
}

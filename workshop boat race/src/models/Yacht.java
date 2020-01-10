package models;

import exeptions.ArgumentExeption;
import helpers.Validator;

public class Yacht extends Boat {
    private Engine engine;
    private int cargoWeight;
    public Yacht(String model, int weight,Engine engine,int cargoWeight) throws ArgumentExeption {
        super(model, weight);
        this.engine=engine;
        this.getcargoWeight(cargoWeight);
    }

    private void getcargoWeight(int cargoWeight) throws ArgumentExeption {
        if(Validator.validatorParams(cargoWeight)){
            this.cargoWeight=cargoWeight;
        }else {
            throw new ArgumentExeption(this.generatErrorMessage("Cargo Weight"));
        }
    }


}

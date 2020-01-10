package garage;

import java.text.DecimalFormat;

public abstract class VehicleImpl implements Vehicle{
    private final DecimalFormat formatter=new DecimalFormat("##.##");
    private double fuelQuantity;
    private double consumption;

    public VehicleImpl(double fuelQuantity,double consumption){
        this.fuelQuantity=fuelQuantity;
        this.consumption=consumption;
    }

    public void drive(double distance){
        if (canDrive(distance)){
            this.fuelQuantity-=this.consumption*distance;
            System.out.println(String.format("travelled %s km",formatter.format(distance)));
        }else {
            System.out.println("needs refueling");

        }
    }
    public void refuel(double liters){
        this.fuelQuantity+=liters;
    }

    @Override
    public String toString() {
        return String.format("%.2f ",this.fuelQuantity);
    }

    protected  boolean canDrive(double distance){
        return this.fuelQuantity>=this.consumption*distance;
    }
}

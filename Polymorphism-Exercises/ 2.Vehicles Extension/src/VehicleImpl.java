import java.text.DecimalFormat;

public abstract class VehicleImpl implements Vehicle{
    protected final DecimalFormat formatter=new DecimalFormat("##.##");
    private double fuelQuantity;
    private double consumption;
    private double tankCapacity;

    public VehicleImpl(double fuelQuantity,double consumption,double tankCapacity){
        this.setFuelQuantity(fuelQuantity);
        this.consumption=consumption;
        this.tankCapacity=tankCapacity;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getConsumption() {
        return consumption;
    }

    protected void setFuelQuantity(double fuelQuantity){
        if(fuelQuantity<=0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        this.fuelQuantity=fuelQuantity;
    }

    public void drive(double distance){
        if (canDrive(distance)){
            this.fuelQuantity-=this.consumption*distance;
            System.out.println(String.format("travelled %s km",formatter.format(distance)));
        }else {
            System.out.println("needs refueling");

        }
    }
    public void driveEmpty(double distance){
        drive(distance);
    }
    public void refuel(double liters){
        if(this.fuelQuantity+liters>tankCapacity){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        if(liters<=0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
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

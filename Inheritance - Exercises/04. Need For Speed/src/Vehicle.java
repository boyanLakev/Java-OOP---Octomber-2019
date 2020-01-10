public abstract class Vehicle {
    private   final static double DEFAULT_FUEL_CONSUMPTION=1.25;
    private double fuelConsumption;
    private  double fuel;
    private int horsePower;

    public Vehicle(double fuel,int horsePower){
        this.fuel=fuel;
        this.horsePower=horsePower;
        this.fuelConsumption=DEFAULT_FUEL_CONSUMPTION;
    }

    public void drive(double kilometer){
        double needFuel=this.fuelConsumption*kilometer;
        if(hasEnoughFuel( kilometer,needFuel)){
            this.fuel-=needFuel;

        }
    }

    public static double getDefaultFuelConsumption() {
        return DEFAULT_FUEL_CONSUMPTION;
    }

    public double getFuelConsumption() {
        return this.fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuel() {
        return this.fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    private boolean hasEnoughFuel(double kilometer, double needFuel) {
        return this.fuel>=needFuel;
    }


}

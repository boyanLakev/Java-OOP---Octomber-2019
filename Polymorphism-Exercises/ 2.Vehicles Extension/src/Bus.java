public class Bus extends VehicleImpl{
    public Bus(double fuelQuantity, double consumption,double tankCapacity) {
        super(fuelQuantity, consumption +1.4, tankCapacity);
    }
    @Override
    public void drive(double distance) {
        System.out.print("Bus ");
        super.drive(distance);

    }

    @Override
    public void driveEmpty(double distance) {
        if (getFuelQuantity()>=(getConsumption()-1.4)*distance){
            setFuelQuantity(getFuelQuantity()-(getConsumption()-1.4)*distance);
            System.out.println(String.format("Bus travelled %s km",formatter.format(distance)));
        }else {
            System.out.println("Bus needs refueling");

        }

    }


    public String toString() {

        return "Bus: "+super.toString();
    }


}

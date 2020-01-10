public class Car extends VehicleImpl {
    private static final String CLAZZ_NAME="Car ";

    public Car(double fuelQuantity, double consumption,double tankCapacity) {

        super(fuelQuantity, consumption+0.9,tankCapacity);
    }

    @Override
    public void drive(double distance) {
        System.out.print("Car ");
        super.drive(distance);

    }
    public String toString() {

        return "Car: "+super.toString();
    }




}

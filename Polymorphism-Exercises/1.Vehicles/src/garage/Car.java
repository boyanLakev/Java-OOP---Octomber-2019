package garage;

public class Car extends VehicleImpl {
    private static final String CLAZZ_NAME="Car ";

    public Car(double fuelQuantity, double consumption) {
        super(fuelQuantity, consumption+0.9);
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

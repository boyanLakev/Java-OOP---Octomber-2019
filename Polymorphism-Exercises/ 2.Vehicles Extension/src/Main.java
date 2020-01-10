import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Vehicle> vehicle = new LinkedHashMap<>();

        vehicle.put("Car", readVehicleInput(scanner.nextLine()));
        vehicle.put("Truck", readVehicleInput(scanner.nextLine()));
        vehicle.put("Bus", readVehicleInput(scanner.nextLine()));

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];
            String type = tokens[1];
            double value = Double.parseDouble(tokens[2]);
            try {


                if (command.equals("Drive")) {
                    vehicle.get(type).drive(value);
                } else if (command.equals("DriveEmpty")) {
                    vehicle.get(type).driveEmpty(value);
                } else {
                    vehicle.get(type).refuel(value);
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        vehicle.entrySet().forEach(e -> System.out.println(e.getValue()));

    }

    private static Vehicle readVehicleInput(String nextLine) {
        String[] tokens = nextLine.split("\\s+");
        double fuelQuantity = Double.parseDouble(tokens[1]);
        double consumption = Double.parseDouble(tokens[2]);
        double tankCapacity = Double.parseDouble(tokens[3]);

        return tokens[0].equals("Car")
                ? new Car(fuelQuantity, consumption, tankCapacity)
                : tokens[0].equals("Truck")
                ? new Truck(fuelQuantity, consumption, tankCapacity)
                : new Bus(fuelQuantity, consumption, tankCapacity);
    }
}

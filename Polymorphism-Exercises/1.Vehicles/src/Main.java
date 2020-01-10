import garage.Car;
import garage.Truck;
import garage.Vehicle;

import java.sql.Driver;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Vehicle> vehicle=new HashMap<>();

       vehicle.put("Car",readVehicleInput(scanner.nextLine())) ;
       vehicle.put("Truck",readVehicleInput(scanner.nextLine()));

       int n=Integer.parseInt(scanner.nextLine());

       while(n-->0){
           String[] tokens=scanner.nextLine().split("\\s+");
           String command=tokens[0];
           String type=tokens[1];
           double value=Double.parseDouble(tokens[2]);
           if(command.equals("Drive")){
               vehicle.get(type).drive(value);
           }else {
               vehicle.get(type).refuel(value);
           }

       }
       vehicle.entrySet().forEach(e-> System.out.println(e.getValue()));

    }

    private static Vehicle readVehicleInput(String nextLine) {
        String[] tokens=nextLine.split("\\s+");

        return tokens[0].equals("Car")
                ? new Car(Double.parseDouble(tokens[1]),Double.parseDouble(tokens[2]))
                : new Truck(Double.parseDouble(tokens[1]),Double.parseDouble(tokens[2]));
    }
}

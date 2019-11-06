import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TrafficLight[] trafficLights = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(e -> TrafficLight.valueOf(e))
                .toArray(TrafficLight[]::new);
        int n = Integer.parseInt(scanner.nextLine());

        TrafficLight[] lights = TrafficLight.values();
        while (n-- > 0) {
            for (int i=0;i<trafficLights.length;i++) {
                int index = (trafficLights[i].ordinal() + 1) % lights.length;
                trafficLights[i] = lights[index];
                System.out.print(trafficLights[i].toString() + " ");

            }
            System.out.println();
        }


    }
}

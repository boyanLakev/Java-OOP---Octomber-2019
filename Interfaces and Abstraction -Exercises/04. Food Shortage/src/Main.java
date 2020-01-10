import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Buyer> map = new HashMap<>();
        int people = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < people; i++) {
            String[] part = scanner.nextLine().split("\\s+");
            if (part.length == 4) {
                Buyer citizen = new Citizen(part[0], Integer.parseInt(part[1]), part[2], part[3]);
                map.put(part[0], citizen);
            } else {
                Buyer rebel = new Rebel(part[0], Integer.parseInt(part[1]), part[2]);
                map.put(part[0], rebel);
            }

        }

        while (true) {
            String name = scanner.nextLine();
            if (name.equals("End")) {
                break;
            }
            if (map.containsKey(name)) {
                map.get(name).buyFood();
            }
        }
        int sum = 0;
        for (Buyer value : map.values()) {
            sum += value.getFood();
        }
        System.out.println(sum);

    }
}

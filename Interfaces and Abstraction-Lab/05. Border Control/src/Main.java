import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (true) {
            String line = scanner.nextLine();
            if ("End".equals(line)) {
                break;
            }
            Identifiable identifiable;
            String[] tokens = line.split("\\s+");
            if (tokens.length == 3) {

                list.add(tokens[2]);
            } else if (tokens.length == 2) {

                list.add(tokens[1]);
            }
        }
        String find=scanner.nextLine();
      list.stream().filter(e-> e.endsWith(find)).forEach(e-> System.out.println(e));
    }
}

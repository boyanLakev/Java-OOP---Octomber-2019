import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = Arrays.stream(scanner.nextLine().split(";"))
                .map(s -> {
                    String[] strings = s.split("=");
                    return new Person(strings[0], Double.parseDouble(strings[1]));
                })
                .collect(Collectors.toList());
        List<Product> products = Arrays.stream(scanner.nextLine().split(";"))
                .map(s -> {
                    String[] strings = s.split("=");
                    return new Product(strings[0], Double.parseDouble(strings[1]));
                })
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String pers = input.split(" ")[0];
            String prod = input.split(" ")[1];

            Product product = null;
            Person person = null;
            for (Product productIter : products) {
                if (productIter.getName().equals(prod)) {
                    product = productIter;
                    break;
                }
            }
            for (Person p : people) {
                if (p.getName().equals(pers)) {
                    person = p;
                }
            }
            if (product != null && person != null) {
                try {
                    person.buyProduct(product);
                    System.out.println(person.getName() + " bought " + product.getName());
                } catch (IllegalStateException ex) {
                    System.out.println(ex.getMessage());
                }
            }

            input = scanner.nextLine();
        }
        for (Person person : people) {
            System.out.println(person.toString());
        }


    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public void buyProduct(Product product) {
        double cost = product.getCost();
        if (this.money >= cost) {
            this.money -= cost;
            products.add(product);
        } else {
            throw new IllegalStateException(this.name +
                    " can't afford " + product.getName());
        }
    }

    @Override
    public String toString() {
        String output = "Nothing bought";
        if (!products.isEmpty()) {
            output=products.stream()
                    .map(p->    p.getName())
                    .collect(Collectors.joining(", "));
        }
        return this.getName() + " - " + output;
    }
}

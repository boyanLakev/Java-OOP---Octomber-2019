import java.io.PrintWriter;

public class Citizen implements Buyer, Person, Identifiable {
    private String name;
    private int age;
    private String id;
    private String birthDate;
    private int food;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
        this.food = 0;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public int getFood() {
        return food;
    }

    public void buyFood() {
        this.food += 10;

    }


}

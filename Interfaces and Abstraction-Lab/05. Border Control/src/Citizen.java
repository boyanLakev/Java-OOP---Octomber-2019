public class Citizen implements Identifiable{
    private String name;
    private int age;
    private String Id;

    public Citizen(String name, int age, String id) {
        this.name = name;
        this.age = age;
        Id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



    @Override
    public String getId() {
        return this.Id;
    }
}

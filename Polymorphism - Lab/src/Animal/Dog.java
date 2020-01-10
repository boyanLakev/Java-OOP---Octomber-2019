package Animal;

public class Dog extends Animal {
    public Dog(String name, String food) {
        super(name,food);
    }

    @Override
    public String explainSelf() {
        return super.toString()+System.lineSeparator()+"DJAAF";
    }
}

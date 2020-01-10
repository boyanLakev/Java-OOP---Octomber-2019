package item;

public class Gem extends Item {
    private String name;
    public Gem(String name, long quality){
        super(quality);
        this.name=name;
    }
}

package item;

public class Cash extends Item {
    private  String name;

    public Cash(String name,long quality){
        super(quality);
        this.name=name;
    }
}

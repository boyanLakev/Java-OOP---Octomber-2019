package item;

public class Gold extends Item {

    public Gold(long quatity){
        super(quatity);
    }


    public void addQuantity(long quantity) {
        this.setQuantity(this.getQuantity()+quantity);
    }

    @Override
    public String toString() {
        return String.format("<Gold> %d",this.getQuantity());
    }
}

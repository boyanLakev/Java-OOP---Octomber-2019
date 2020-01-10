package item;

public abstract class Item {
    private long quantity;

    protected Item(long quantity){
        this.quantity=quantity;
    }
    public long getQuantity(){
        return this.quantity;
    }

    protected void setQuantity(long quantity) {
        this.quantity = quantity;
    }
    public void addQuantity(long quantity) {
        this.quantity+=quantity;
    }

}

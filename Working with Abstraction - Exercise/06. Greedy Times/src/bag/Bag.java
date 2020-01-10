package bag;

import item.Cash;
import item.Gem;
import item.Gold;
import item.Item;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class Bag {
    private long capacity;
    private  long takenCapacity;
    private List<List<Item>> items;

    public Bag(long capacity){
        this.capacity=capacity;
        this.items=new ArrayList<>();
        this.items.add(new ArrayList<>());
        this.items.add(new ArrayList<>());
        this.items.add(new ArrayList<>());


    }

    public long getCapacity (){
        return this.capacity;
    }

    public void addGem(String name, long quantity) {
        long goldAmont=this.items.get(0).get(0).getQuantity();
        long gemAmont=this.items.get(1).stream().mapToLong(Item::getQuantity).sum();

        if(goldAmont>=gemAmont+quantity){
            this.capacity+=quantity;
            Item item=new Gem(name,quantity);
            this.items.get(1).add(item);
        }
    }

    public void addCash(String name, long quantity) {
        long gemAmont=this.items.get(1).stream().mapToLong(Item::getQuantity).sum();
        long cashAmont=this.items.get(2).stream().mapToLong(Item::getQuantity).sum();
        if(gemAmont>=cashAmont+quantity){
            this.capacity+=quantity;
            Item item=new Cash(name,quantity);
            this.items.get(2).add(item);
        }

    }

    public void addGold(long quantity) {
        if(this.items.get(0).size()==0){
            this.items.get(0).add(new Gold(quantity));
        }else {
            this.items.get(0).get(0).addQuantity(quantity);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(items.get(0).get(0).toString()).append(System.lineSeparator());


        return sb.toString();
    }
}

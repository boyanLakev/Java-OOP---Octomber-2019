package pizza;

public abstract class FoodProduct {
    private double weight;

    protected FoodProduct(double weight){
        this.weight=weight;
    }
    private void setWeight(double weight){
        this.weight=weight;
    }
    public double calculateCalories(){
        return weight*2;
    }



}

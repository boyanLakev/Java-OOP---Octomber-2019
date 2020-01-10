public class Chicken {
    private String name;
    private int age;

    public Chicken(String name,int age){
        this.setName(name);
        this.setAge(age);
    }

    private void setName(String name) {
        if(name.equals(null) || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name=name;
    }

    private void setAge(int age){
        if(age<0 || age >15){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age=age;
    }
    public double productPerDay (){
        return calculateProductPerDay();
    }

    private double calculateProductPerDay() {
        double eggDay=0;
        if(this.age<5){
            eggDay=2;
        }else if(this.age<11){
            eggDay=1;
        }else{
            eggDay=0.75;
        }
        return eggDay;

    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.",
                this.name,
                this.age,
                this.productPerDay());
    }
}

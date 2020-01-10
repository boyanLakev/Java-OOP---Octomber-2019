package utils;

public class ValidatorUtil {
    public static void validatToppingWeight(double weight,String topping){
        if(weight<1 || weight>50){
           throw new IllegalArgumentException(
                   String.format(topping+" weight should be in the range [1..50]."));
        }
    }
    public static void validatDoughWeight(double weight){
        if(weight<1 || weight>200){
            throw new IllegalArgumentException(
                    "Dough weight should be in the range [1..200].");
        }
    }
}

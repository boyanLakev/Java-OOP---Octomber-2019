package pizza;

import enums.BakingTecnique;
import enums.FlourType;
import utils.ValidatorUtil;

public class Dough{
    private String flourType;
    private String bakingTechnique;
    private double weight;


    public Dough(String flour, String bakingTechnique, double weight) {
        this.weight=weight;
        ValidatorUtil.validatDoughWeight(weight);
        this.setFlourType(flour);
         BakingTecnique.valueOf(bakingTechnique.toUpperCase());
        this.bakingTechnique=bakingTechnique;
    }

    public String getFlourType() {
        return flourType;
    }

    public String getBakingTechnique() {
        return bakingTechnique;
    }

    public void setBakingTechnique(String bakingTechnique) {
        this.bakingTechnique = bakingTechnique;
    }

    public double getWeight() {
        return weight;
    }

    private void setWeight(double weight) {
        this.weight = weight;
    }



    private void setFlourType(String flour) {
        try {
             FlourType.valueOf(flour.toUpperCase());
            this.flourType=flour;
        } catch (IllegalArgumentException ex) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }


    public double calculateCalories() {
        double calories = this.weight*2;
        calories *= FlourType.valueOf(this.flourType).getModifier();
        calories *= BakingTecnique.valueOf(this.bakingTechnique).getModifier();
        return calories;
    }
}

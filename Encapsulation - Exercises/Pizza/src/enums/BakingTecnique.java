package enums;

public enum BakingTecnique {
    CRISPY(0.9),
    CHEWY(1.1),
    HOMEMADE(1.0);

    private double modifier;

    BakingTecnique(double modifier) {
        this.modifier = modifier;
    }

    public double getModifier() {
        return modifier;
    }
}

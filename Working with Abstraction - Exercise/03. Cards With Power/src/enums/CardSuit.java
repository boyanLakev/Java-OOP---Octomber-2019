package enums;

public enum CardSuit {
    CLUBS,
    DIAMONDS,
    HEARTS,
    SPADES;



    public int getValue(){
        return this.ordinal();
    }

}

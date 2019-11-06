package model;

import enums.CardRank;
import enums.CardSuit;

public class Card {
    private CardSuit suit;
    private CardRank rank;

    public Card(CardSuit suit,CardRank rank){
        this.suit=suit;
        this.rank=rank;
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d%n",
                this.rank.name(),
                this.suit.name(),
                calculatePower());
    }

    private int calculatePower() {
        return (this.suit.getValue()*13)+this.rank.getIndex();
    }
}

package br.uff.qet.cardgame;

public class Card {
    private Suit suit;
    private Rank value;

    public Card(Suit suit, Rank value) {
        this.value = value;
        this.suit = suit;
    }

    public Suit getSuit(){
        return this.suit;
    }

    public Rank getType() {
        return value;
    }

    public int getValue() {
        return value.getValue();
    }
}
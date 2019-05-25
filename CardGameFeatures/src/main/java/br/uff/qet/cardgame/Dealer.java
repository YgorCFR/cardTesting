package br.uff.qet.cardgame;

public class Dealer {
    private Deck deck;

    public Dealer(){
        this.deck = new Deck();
        deck.addCards();
        deck.shuffle();
    }

    public int countUnshuffledCards() {
        return deck.countUnshuffledCards();
    }

    public int countCards() {
        return deck.countCards();
    }


    public void dealCard(Player player) {
        Card card = deck.dealCard();
        player.takeCard(card);

    }
}
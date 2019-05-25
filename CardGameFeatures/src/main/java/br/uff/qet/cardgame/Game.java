package br.uff.qet.cardgame;

import java.util.ArrayList;
import java.util.HashMap;

public class Game {
    private ArrayList<Player> players;
    private Dealer dealer;


    public Game(){
        this.players = new ArrayList<>();
        this.dealer = new Dealer();
    }


    public void addPlayer(Player player) {
        players.add(player);
    }
    
    public void removePlayer(Player player) {
    	players.remove(player);
    }

    public int countPlayers() {
        return players.size();
    }

    public void dealGame() {
        for (Player player : players){
            dealer.dealCard(player);
        }
    }

    public String checkWinner() {
        ArrayList<Integer> cardValues = new ArrayList<>();
        for (Player player : players) {
            int cardValue = player.getHandValue();
            cardValues.add(cardValue);
        }
        return "Someone wins";
    }
    
    public Player jogar(ArrayList<Card> c1, ArrayList<Card> c2) {
        // 1º TESTE
       /* int cardOne = players.get(0).wasteCard(c1);
        int cardTwo = players.get(1).wasteCard(c2);
        
        if (cardOne  > cardTwo) {
        	return players.get(0);
        }
        else {
        	return players.get(1);
        }*/
    	
    	
    	
    	
    	//2º TESTE
      /*c1 = players.get(0).wasteCard(c1);
    	c2 = players.get(0).wasteCard(c2);
    	
    	
    	if(c1.getSuit().equals(Suit.CLUBS) && !c2.getSuit().equals(Suit.CLUBS)) {
    		return players.get(0);
    		
    	}
    	
    	else if (!c1.getSuit().equals(Suit.CLUBS) && c2.getSuit().equals(Suit.CLUBS)) {
    		return players.get(1);
    	}
    	
    	else if(c1.getSuit().equals(Suit.SPADES) && c2.getSuit().equals(Suit.HEARTS)) {
    		return players.get(1);
    	}
    	
    	else if(c1.getSuit().equals(Suit.DIAMONDS) && c2.getSuit().equals(Suit.HEARTS)) {
    		return players.get(1);
    	}
    	
    	else if(c1.getSuit().equals(Suit.DIAMONDS) && c2.getSuit().equals(Suit.SPADES)) {
    		return players.get(1);
    	}
    	
    	
    	else if(c1.getSuit().equals(Suit.SPADES) && c2.getSuit().equals(Suit.DIAMONDS)) {
    		return players.get(0);
    	}
    	
    	else if(c1.getSuit().equals(Suit.HEARTS) && c2.getSuit().equals(Suit.DIAMONDS)) {
    		return players.get(0);
    	}
    	
    	else if(c2.getSuit().equals(c1.getSuit())) {
    		if(c1.getValue() > c2.getValue()) {
    			return players.get(0);
    		} else {
    			return players.get(1);
    		}
    	}
    	
    	else {
    		return players.get(0);
    	}*/
    	
    	
    	
    	
    	//3º TESTE
    	/*
    	c1 = players.get(0).wasteCard(c1);
    	c2 = players.get(0).wasteCard(c2);
    	
    	HashMap<Suit, Integer> suitsMap = new HashMap<Suit, Integer>();
    	suitsMap.put(Suit.CLUBS, 4);
    	suitsMap.put(Suit.HEARTS, 3);
    	suitsMap.put(Suit.SPADES, 2);
    	suitsMap.put(Suit.SPADES, 1);
    	
    	int suitOne = suitsMap.get(c1.getSuit());
    	int suitTwo = suitsMap.get(c2.getSuit());
    	
    	if (suitOne > suitTwo) {
    		return players.get(0);
    	}
    	else if (suitOne < suitTwo) {
    		return players.get(1);
    	}
    	else {
    		if(c1.getValue() > c2.getValue()) {
    			return players.get(0);
    		} else {
    			return players.get(1);
    		}
    	}
    	*/
    	
    	//4º TESTE
    	Card cardOne = players.get(0).chooseCardByHand(c1.get(0));
    	Card cardTwo = players.get(1).chooseCardByHand(c2.get(0));
    	
    	HashMap<Suit, Integer> suitsMap = new HashMap<Suit, Integer>();
    	suitsMap.put(Suit.CLUBS, 4);
    	suitsMap.put(Suit.HEARTS, 3);
    	suitsMap.put(Suit.SPADES, 2);
    	suitsMap.put(Suit.SPADES, 1);
    	
    	int suitOne = suitsMap.get(cardOne.getSuit());
    	int suitTwo = suitsMap.get(cardTwo.getSuit());
    	
    	if (suitOne > suitTwo) {
    		return players.get(0);
    	}
    	else if (suitOne < suitTwo) {
    		return players.get(1);
    	}
    	else {
    		if(cardOne.getValue() > cardTwo.getValue()) {
    			return players.get(0);
    		} else {
    			return players.get(1);
    		}
    	}
    }
    
    
    
    /*
    public Player jogarTerceiroCaso (Card c1, Card c2){
        
       
    }*/
    
    

}

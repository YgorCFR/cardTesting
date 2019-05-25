
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.qet.cardgame.tests;

import br.uff.qet.cardgame.*;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Aluno
 */
public class JogoTest {
    private Player p1 = new Player("Gerrard");
    private Player p2 = new Player("Lucy");
    private Dealer del;
    private Deck deck = new Deck(); 
    private Game game = new Game();
    
    
    @Before
    public void prepararJogo(){
        game.addPlayer(p1);
        game.addPlayer(p2);
        
        p1.takeCard(new Card(Suit.CLUBS, Rank.ACE));
        p1.takeCard(new Card(Suit.DIAMONDS, Rank.FOUR));
        p1.takeCard(new Card(Suit.HEARTS, Rank.KING));
        p1.takeCard(new Card(Suit.SPADES, Rank.QUEEN));
        
        p2.takeCard(new Card(Suit.DIAMONDS, Rank.ACE));
        p2.takeCard(new Card(Suit.HEARTS, Rank.NINE));
        p2.takeCard(new Card(Suit.DIAMONDS, Rank.FOUR));
        p2.takeCard(new Card(Suit.CLUBS, Rank.TEN));
        
    }
    
   /* @Test
    public void jogarTest () {
        Player winner = game.jogar(p1.chooseCard(0), p2.chooseCard(1));
        assertEquals(p1, winner);
    }*/
    
    @Test
    public void jogarTestTwo () {
    	game.removePlayer(p1);
    	game.removePlayer(p2);
    	
    	Player p3 = new Player("Romero");
    	Player p4 = new Player("Emma");
    	
    	game.addPlayer(p3);
    	game.addPlayer(p4);
    	
    	p3.takeCard(new Card(Suit.CLUBS, Rank.EIGHT));
    	p3.takeCard(new Card(Suit.HEARTS, Rank.ACE));
    	p3.takeCard(new Card(Suit.SPADES, Rank.SIX));
    	
    	p4.takeCard(new Card(Suit.HEARTS, Rank.KING));
    	p4.takeCard(new Card(Suit.CLUBS, Rank.EIGHT));
    	p4.takeCard(new Card(Suit.CLUBS, Rank.EIGHT));
    	
    	
    	Player winner  = game.jogar(p3.getHand(), p4.getHand());
    	assertEquals(p3, winner);
    }
    
    @Test
    public void pontosTest () {
    	int jogadorPontos = p1.getHandValue();
    	assertEquals(25, jogadorPontos);
    }
    
    
    
    
    
    
    
    
    
}

/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import ca.sheridancollege.project.Deck.*;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
/**
 * @author Harmanpreet Kaur 
 * @author Manpreet Kaur
 * @author Manjot Kaur
 * @author Arshpreet Kaur
 * modified: 16 August, 2021
 */
public class CheckWinner extends Deck{
    
        private static boolean winner = true;
        private Player whoWon = new Player() {};
        private ArrayList<Card> player1Cards = new ArrayList<Card>();
        private ArrayList<Card> player2Cards = new ArrayList<Card>();
        
        //create an default constructor
        public CheckWinner(){
            
        }
        
	/**
	 * 
	 * @param player1
	 * @param player2
	 */
	public boolean checkWinner(Player player1, Player player2) {
            
            //checks if winner is found or if the deck is empty            
            player1Cards = player1.getCards();
            player2Cards = player2.getCards();
            if((player1Cards.get(0).getSuit() == player1Cards.get(1).getSuit()) && (player1Cards.get(1).getSuit()==player1Cards.get(2).getSuit())&& (player1Cards.get(2).getSuit()==player1Cards.get(3).getSuit())&& (player1Cards.get(3).getSuit()==player1Cards.get(4).getSuit()) ){
                setWinner(player1);
                return winner = false;
            }
            else if((player2Cards.get(0).getSuit() == player2Cards.get(1).getSuit()) && (player2Cards.get(1).getSuit()==player2Cards.get(2).getSuit())&& (player2Cards.get(2).getSuit()==player2Cards.get(3).getSuit())&& (player2Cards.get(3).getSuit()==player2Cards.get(4).getSuit()) ){
                setWinner(player2);
                return winner = false; 
            }
            
            return super.checkDeck();
	}
        
        public Player getWinner(){
            return whoWon;
        }
        
        /**
	 * 
	 * @param player
	 */
        public void setWinner(Player player){
            this.whoWon = player;
        }
}

/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * A class that models each Player in the game. Players have an identifier, 
 * which should be unique.
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

public class Player {
 
    //create an instance variable
    private String playerName;
    private ArrayList<Card> cards = new ArrayList<>();
    
    //create a constructor of Player class
    public Player(){
        super();
    }
    
    public Player(String playerName) {
        this.playerName = playerName;
    }
	
    /**
     * @return playerName 
     */
    public String getPlayerName() {
        return this.playerName;
    }
	
    /*
    * @return cards
    */
    public ArrayList<Card> getCards() {
	return cards;
    }
 
    /*
    * @return void
    * sets playerName
    */
    public void setPlayerName(String playerName) {
	this.playerName = playerName;
    }
       
    /**
     * @param cards
     * set cards
     */
    public void setCards(ArrayList<Card> cards){
	this.cards = cards;
    }

    //prints the cards to console
    public void printCards() {
	for(int i=0; i<cards.size();i++) {
            System.out.println("Card "+(i+1)+": "+cards.get(i).getValue()+ "     "+cards.get(i).getSuit());    
        }
    }
        
        /**
         * 
         * @param card
         * @param index
         */
        public void changeCard(Card card, int index){
            cards.set(index, card);
        }

    /**
     *
     * @return
     */
    //Overriding the declareWinner() method in Game
    @Override
    public String toString(){
        return "Congratulatins "+ playerName+ " won the game with";
   }
}

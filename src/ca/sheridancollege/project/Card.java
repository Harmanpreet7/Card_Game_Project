/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 */
/**
 * @author Harmanpreet Kaur 
 * @author Manpreet Kaur
 * @author Manjot Kaur
 * @author Arshpreet Kaur
 * modified: 16 August, 2021
 */
public class Card {
    
    //enum for card value and suits
    public enum Values{
		ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING;
	}
	public enum Suits{
		HEART,DIAMOND,SPADES,CLUBS;
	}
	
        //declare an instance variables
	private final Values value;
	private final Suits suit;
	
	public Card(Card.Suits s, Card.Values v) {
		this.value = v;
		this.suit = s;
	}
	public Card() {
		this.value=null;
		this.suit=null;
	}
	public Values getValue(){
		
		return this.value;
	}
	
	public Suits getSuit() {
		return this.suit;
	}

    /**
     *
     * @return
     */
    //Overriding the default toString() method    
    @Override
	public String toString() {
		return (getValue() + "     " + getSuit());
	}
    
}

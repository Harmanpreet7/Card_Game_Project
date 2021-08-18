/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 * @author Harmanpreet Kaur 
 * @author Manpreet Kaur
 * @author Manjot Kaur
 * @author Arshpreet Kaur
 * created: 11 August, 2021
 * modified: 16 August, 2021
 */
public class GenerateCard {
    
    //create an instance variables
    private static int counter = 0;
    private static final Card[] cards = new Card[Card.Suits.values().length*Card.Values.values().length];

    //create a default constructor
    public GenerateCard(){
        
    }
    
    //generate cards
    public static void generateCards() {
		
	for(Card.Suits s: Card.Suits.values()) {
            
	    for(Card.Values v : Card.Values.values()) {
                
	        cards[counter] = new Card(s,v);
	        counter++;
	    }
	}
    }
	
    /**
     * @return cards 
     */
    public static Card[] getCards() {
	return cards;
    }
    
}

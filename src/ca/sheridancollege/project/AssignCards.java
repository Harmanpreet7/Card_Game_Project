/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Harmanpreet Kaur 
 * @author Manpreet Kaur
 * @author Manjot Kaur
 * @author Arshpreet Kaur
 * created: 11 August, 2021
 * modified: 16 August, 2021
 */
public class AssignCards extends Deck{
	       
	public ArrayList<Card> generateCard(int x) {
	    ArrayList<Card> fiveCards = new ArrayList<>();
            
            //generate the given numbers of cards
            for(int i = 0;i<x;i++){
                fiveCards.add(new Card());
            }
        
		int randomNumber;
		for(int i=0;i<fiveCards.size();i++) {
                        
		    randomNumber = (int)(Math.random()*(Card.Values.values().length * Card.Suits.values().length));
		    fiveCards.set(i, super.getCards().get(randomNumber));
                    
		    while(fiveCards.get(i).getValue()==null || fiveCards.get(i).getSuit()==null) {
			randomNumber = (int)(Math.random()*(Card.Values.values().length * Card.Suits.values().length));
			fiveCards.set(i,super.getCards().get(randomNumber));
                    }
                    
		    super.getCards().set(randomNumber, new Card());
                    super.setCards(super.getCards());
		}
		return fiveCards;
	}

    /**
     *
     * @return
     */
    //Overriding the getCards() method in Deck
    @Override
	public  List<Card> getCards() {
		return super.getCards();
	}
}

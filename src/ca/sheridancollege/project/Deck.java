/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.Arrays;
import java.util.List;
import java.util.*;

/**
 * @author Harmanpreet Kaur 
 * @author Manpreet Kaur
 * @author Manjot Kaur
 * @author Arshpreet Kaur
 * created: 11 August, 2021
 * modified: 16 August, 2021
 */
public class Deck {
    
    //create an instance variables
    private List<Card> cards = Arrays.asList(GenerateCard.getCards());
    private int emptyDeck = 0;
    
    //create a default constructor
    public Deck(){
        
    }
    
    //prints out the card details
    public void print() {
        cards.forEach((c) -> {
            System.out.println(c);
        });
    }
    
    /**
     * @return cards
     */
    public List<Card> getCards(){
        return cards;
    }
    
    /**
     * @param cards
     */
    public void setCards(List<Card> cards){
    
        this.cards = cards;
    }
    
    /**
     * @return true or false
     * checks if deck is empty
     */
    public boolean checkDeck(){
        emptyDeck = 0;
        for(int i=0;i<cards.size();i++){
            if(cards.get(i).getSuit()==null){
                emptyDeck++;
            }
        }
        
        return emptyDeck != 52;
    }
}
  


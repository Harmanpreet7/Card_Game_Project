/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 * @author Harmanpreet Kaur 
 * @author Manpreet Kaur
 * @author Manjot Kaur
 * @author Arshpreet Kaur
 * created: 11 August, 2021
 * modified: 16 August, 2021
 */

public class PickACard extends Deck {
    
    //create an instance variables
    private Card card= new Card(); 
    private int randomNumber;
    private final Scanner input = new Scanner(System.in);
    private String choice;
    
    //create a default constructor
    public PickACard(){
        
    }
    
    /**
	 * 
	 * @param player
	 */
    public void getCard(Player player) {
	randomNumber = (int)(Math.random()*(Card.Values.values().length * Card.Suits.values().length));
        card = super.getCards().get(randomNumber);
        while(card.getValue()==null || card.getSuit()==null){
            randomNumber = (int)(Math.random()*(Card.Values.values().length * Card.Suits.values().length));
            card = super.getCards().get(randomNumber);
        }
        
        super.getCards().set(randomNumber, new Card());
        System.out.println("\n For  "+player.getPlayerName());
        player.printCards();
        System.out.println("You got "+card.getValue()+"     "+card.getSuit());
        System.out.println("\n Would you like to change the card ?(yes/no) ");

        
        
        choice = input.next();
        choice = choice.trim();
        while(!(choice.equalsIgnoreCase("yes")||choice.equalsIgnoreCase("no"))){
                
            System.out.println("\n Answer must be yes or no.\nWrite yes or no");
            choice = input.next();
            choice = choice.trim();
        }
        if(choice.equalsIgnoreCase("yes")){
            System.out.println("Which card would you like to change it with "+card.getValue()+"     "+card.getSuit());
            System.out.println("\n Your cards are: ");
            player.printCards();
            int temp = input.nextInt();
            player.changeCard(card, temp-1);
            System.out.println("\n Now your cards are ");
            player.printCards();
             
        }
        else if(choice.equalsIgnoreCase("no")){
            System.out.println(" Dropped the card "+ card.getValue()+"     "+card.getSuit());
            
        }
        else{
            System.out.println("\n Reply must be yes or no");
        }
        
    }

    /*
    * return card
    */ 
    public Card getCard() {
        return card;
    }
}

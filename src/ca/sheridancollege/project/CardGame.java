/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class CardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Welcome to java");
	GenerateCard.generateCards();
	Scanner sc = new Scanner(System.in);
        
        //asking user to input the players information        
	List<Player> players = new ArrayList<>();
        System.out.print("Enter First Player name:  ");
	players.add(new Player(sc.next()));
        System.out.print("Enter Second Player name:  ");
        players.add(new Player(sc.next()));
        System.out.print("Enter Third Player name:  ");
        players.add(new Player(sc.next()));
        
		                
        //assigning cards to players        
	AssignCards randomCardGenerator = new AssignCards();
        for(int x=0;x<players.size();x++) {
	    players.get(x).setCards(randomCardGenerator.generateCard(5));
	}
                
        //check winner of the game
        CheckWinner checkWinner = new CheckWinner();
                
        //continues the game with 1 card swap option for each player   
        PickACard oneCard = new PickACard();
        int i =0;
        while(checkWinner.checkWinner(players.get(0), players.get(1))){
                
            if(i==0){
                oneCard.getCard(players.get(0));
                i=1;
            }
            else{
                oneCard.getCard(players.get(1));
                i=0;
            }
        }
           
        //generate the rest of the deck
        Deck deck = new Deck();
        
        //check if deck is empty or a winner has already declared        
        if(!deck.checkDeck()){
            System.out.println("oops! You are out of cards. Try again");
        }else{
            System.out.println(checkWinner.getWinner().toString());
            checkWinner.getWinner().printCards();
        }
    }
}
 


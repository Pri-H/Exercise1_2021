/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Sivagama 
 * @author Priyanka 991606964
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Card[] magicHand = new Card[7];
        
        Random random = new Random();
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(random.nextInt(13)+1);
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i] = c;
        }
        
        Card userCard = new Card();
        
        System.out.println("Pick a suit for your card");
        userCard.setSuit(Card.SUITS[input.nextInt()]);
        
        System.out.println("Pick a value for your card");
        userCard.setValue(input.nextInt());
        
        boolean match = false;
        for(int i = 0; i < magicHand.length; i++){
            if(magicHand[i].getValue() == userCard.getValue()
                    && magicHand[i].getSuit().equals(userCard.getSuit())){
            match = true;
            break;
            }
                
        }
        
        String response = match ? "Right guess" : "No match";
        System.out.println(response);
    }
    
}

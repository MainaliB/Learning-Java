/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */

import java.util.*;
public class DeckOfCards {
    public static void main(String[] args){
        int[] deck = new int[52];//syntax to initialize an array of integers
        
        String[] suits = {"Spades","Hearts","Diamonds","Clubs"};
        
        String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10",
        "Jack","Queen","King"};
        
        //initialize the cards
        for (int i = 0; i<deck.length;i++){
            deck[i] = i; // here we have assigned value 0 to 51 into the deck array
        }
        
        //shuffle the cards
        for (int i = 0; i < deck.length; i++){
            //generate a random number for the index could be anything 
            int index = (int) (Math.random() * deck.length);
            
            //assign the value indexed att position i from the dect to temp 
            int temp = deck[i];
            //replace the i th indexed value with value at index
            deck[i]= deck[index];
            
            deck[index] = temp;
        }
        //display the first four cards
        for (int i = 0; i < 4; i++){
            String suit = suits[deck[i]/13];
            String rank = ranks[deck[i]%13];
            System.out.println("Card number " + deck[i] + ": " +
                    rank + " of " + suit);
    
        }
    
    }
    
}

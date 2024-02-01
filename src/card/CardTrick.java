/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author shamaans
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
          Card[] magicHand = new Card[7];

        // Fill magicHand with random Card objects
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            Random random = new Random();

            // Set a random value and suit for each card
            c.setValue(random.nextInt(13) + 1); // Values from 1 to 13
            c.setSuit(Card.SUITS[random.nextInt(4)]); // Random suit
            magicHand[i] = c;
        }

        

        // Add this code to create the luckyCard object
Card luckyCard = new Card();
luckyCard.setValue(7); // Set the card number of your choosing
luckyCard.setSuit("Diamonds"); // Set the suit of your choosing

        // Ask the user for Card value and suit
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a card value (1-13): ");
        int userValue = scanner.nextInt();
        System.out.print("Enter a card suit (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = scanner.next();

        // Create user's card
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        // Search for the user's card in magicHand
        boolean isInMagicHand = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                isInMagicHand = true;
                break;
            }
        }

        // Report the result
        if (isInMagicHand) {
            System.out.println("Congratulations! Your card is in the magic hand of random cards.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand of random cards.");
        }
    }
    
}

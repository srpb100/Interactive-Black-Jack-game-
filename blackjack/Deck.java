/**
 *
 * Author   :   Santosh Reddy Pullaiahgari Bala
 * Wiu Id   :   915-63-0014.  
 * 
 **/

package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    
    List<Card> deckOfCards = new ArrayList<Card>();
        
    public Deck()
    {        
        for(int i=0; i<4;i++)
        {
            for(int j=0;j<13;j++)
            {
                Card c = new Card(i,j);
                deckOfCards.add(c);
            }
        }        
    }
    /*public void printDeck()
    {
        for(int i=0; i< deckOfCards.size();i++)
        {
          System.out.println("the cards is: "+deckOfCards..toString());
        }
    }*/
    
    public void shuffle()
    {
      Collections.shuffle(deckOfCards);
    }    
}
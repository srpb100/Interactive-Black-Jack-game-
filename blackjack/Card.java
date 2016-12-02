/**
 *
 * Author   :   Santosh Reddy Pullaiahgari Bala
 * Wiu Id   :   915-63-0014.  
 * 
 **/

package blackjack;

public class Card {
    private int suit, value;
    private String[] cardSuit = {"Spades", "Diamonds", "Hearts", "Clubs"};
    private String[] cardValue = {"Ace","2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    public Card(int cSuit, int cValue)
    {
        suit = cSuit; 
        value = cValue;
    }
    
    public String toString()
    {
        String cardInfo = cardValue[value] + " of " + cardSuit[suit];

        return cardInfo;
    }
    
    public String getImage()
    {
        String cardImage = cardValue[value]+cardSuit[suit];
        
        return cardImage;
    }
    
    /*public int getValue()
    {   
        return value+1;
    }   */
    
    public int getCount()
    {
        return value+1;
    }
    public int getValue()
    {   
        //getCount();
        if(getCount()>=10)
            return 10;
        else
        return value+1;
    }
    
}
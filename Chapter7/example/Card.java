package Chapter7.example;// Fig. 7.9: Card.java
// Card class represents a playing card.
//
// Java How to Program, 10th Ed. (Deitel) Page 254


public class Card
{
   private String face;
   private String suit;

   public Card( String cardFace, String cardSuit )
   {
      face = cardFace;
      suit = cardSuit;
   }

   public String toString()
   {
      return face + " of " + suit;
   }
}

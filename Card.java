// Fig. 7.9: Card.java
// Card class represents a playing card.

public class Card 
{
   private String face; // face of card ("Ace", "Deuce", ...)
   private String suit; // suit of card ("Hearts", "Diamonds", ...)

   // two-argument constructor initializes card's face and suit
   public Card( String cardFace, String cardSuit )
   {
      face = cardFace; // initialize face of card
      suit = cardSuit; // initialize suit of card
   } // end two-argument Card constructor

   public int getValue()
   {
     if (face == "Ace") return 11;
     if (face == "Deuce") return 2;
     if (face == "Three") return 3;
     if (face == "Four") return 4;
     if (face == "Five") return 5;
     if (face == "Six") return 6;
     if (face == "Seven") return 7;
     if (face == "Eight") return 8;
     if (face == "Nine") return 9;
     if (face == "Ten") return 10;
     if (face == "Jack") return 10;
     if (face == "Queen") return 10;
     if (face == "King") return 10;
     return -1;
   }
   
   // return String representation of Card
   public String toString() 
   { 
      return face + " of " + suit;
   } // end method toString
} // end class Card


/**************************************************************************
 * (C) Copyright 1992-2012 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/

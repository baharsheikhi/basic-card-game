package cs3500.hw02;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bahar on 5/18/16.
 * a class to test the standardCard method
 */
public class StandardCardTest {

  Card aceSpades = new StandardCard(Suit.Spades, Rank.Ace);
  Card twoSpades = new StandardCard(Suit.Spades, Rank.Two);
  Card threeSpades = new StandardCard(Suit.Spades, Rank.Three);
  Card fourSpades = new StandardCard(Suit.Spades, Rank.Four);
  Card fiveSpades = new StandardCard(Suit.Spades, Rank.Five);
  Card sixSpades = new StandardCard(Suit.Spades, Rank.Six);
  Card sevenSpades = new StandardCard(Suit.Spades, Rank.Seven);
  Card eightSpades = new StandardCard(Suit.Spades, Rank.Eight);
  Card nineSpades = new StandardCard(Suit.Spades, Rank.Nine);
  Card tenSpades = new StandardCard(Suit.Spades, Rank.Ten);
  Card jackSpades = new StandardCard(Suit.Spades, Rank.Jack);
  Card queenSpades = new StandardCard(Suit.Spades, Rank.Queen);
  Card kingSpades = new StandardCard(Suit.Spades, Rank.King);

  Card fiveHearts = new StandardCard(Suit.Hearts, Rank.Five);

  Card queenClubs = new StandardCard(Suit.Clubs, Rank.Queen);

  Card tenDiamonds = new StandardCard(Suit.Diamonds, Rank.Ten);

  Rank badRank = Rank.Ace;
  Card aceSpadesBad = new StandardCard(Suit.Spades, badRank);



  @Test
  public void testConstructor() {
    assertEquals();
    //TODO override .equals for cards
  }

  @Test
  public void testCompareTo() {

  }



  @Test
  public void testToString() {
    assertEquals("A♠", aceSpades.toString());
    assertEquals("2♠", twoSpades.toString());
    assertEquals("3♠", threeSpades.toString());
    assertEquals("4♠", fourSpades.toString());
    assertEquals("5♠", fiveSpades.toString());
    assertEquals("6♠", sixSpades.toString());
    assertEquals("7♠", sevenSpades.toString());
    assertEquals("8♠", eightSpades.toString());
    assertEquals("9♠", nineSpades.toString());
    assertEquals("10♠", tenSpades.toString());
    assertEquals("J♠", jackSpades.toString());
    assertEquals("Q♠", queenSpades.toString());
    assertEquals("K♠", kingSpades.toString());
  }

}
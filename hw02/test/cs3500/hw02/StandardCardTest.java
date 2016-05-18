package cs3500.hw02;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bahar on 5/18/16.
 */
public class StandardCardTest {

  Card aceSpades = new StandardCard("Spades", "Ace");
  Card aceSpadesInt = new StandardCard("Spades", 14);
  Card twoSpadesInt = new StandardCard("Spades", 2);
  Card threeSpadesInt = new StandardCard("Spades", 3);
  Card fourSpadesInt = new StandardCard("Spades", 4);
  Card fiveSpadesInt = new StandardCard("Spades", 5);
  Card sixSpadesInt = new StandardCard("Spades", 6);
  Card sevenSpadesInt = new StandardCard("Spades", 7);
  Card eightSpadesInt = new StandardCard("Spades", 8);
  Card nineSpadesInt = new StandardCard("Spades", 9);
  Card tenSpadesInt = new StandardCard("Spades", 10);
  Card jackSpadesInt = new StandardCard("Spades", 11);
  Card queenSpadesInt = new StandardCard("Spades", 12);
  Card kingSpadesInt = new StandardCard("Spades", 13);


  @Test
  public void testConstructor() {
    assertEquals("A♠", aceSpades.toString());
    assertEquals(aceSpades.toString(), aceSpadesInt.toString());
    assertEquals("2♠", twoSpadesInt.toString());
    assertEquals("3♠", threeSpadesInt.toString());
    assertEquals("4♠", fourSpadesInt.toString());
    assertEquals("5♠", fiveSpadesInt.toString());
    assertEquals("6♠", sixSpadesInt.toString());
    assertEquals("7♠", sevenSpadesInt.toString());
    assertEquals("8♠", eightSpadesInt.toString());
    assertEquals("9♠", nineSpadesInt.toString());
    assertEquals("10♠", tenSpadesInt.toString());
    assertEquals("J♠", jackSpadesInt.toString());
    assertEquals("Q♠", queenSpadesInt.toString());
    assertEquals("K♠", kingSpadesInt.toString());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructorExceptions() {
    Card c = new StandardCard("Spades", 15);
    Card d = new StandardCard("Cat", 2);
  }

}
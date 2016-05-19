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
  Card tenHearts = new StandardCard(Suit.Hearts, Rank.Ten);

  Card queenClubs = new StandardCard(Suit.Clubs, Rank.Queen);
  Card kingClubs = new StandardCard(Suit.Clubs, Rank.King);

  Card tenDiamonds = new StandardCard(Suit.Diamonds, Rank.Ten);

  Rank aceCopy = Rank.Ace;
  Card aceSpadesCopy = new StandardCard(Suit.Spades, aceCopy);

  Suit heartCopy = Suit.Hearts;
  Card queenHeartsCopy = new StandardCard(heartCopy, Rank.Queen);


  //tests that the constructor properly links the Ranks
  @Test
  public void testConstructorRanks() {
    assertEquals(fiveSpades, fiveSpades);
    assertEquals(Rank.Ace, aceCopy);
    assertEquals(aceSpades, aceSpadesCopy);
    assertFalse(aceSpades.equals(nineSpades));
  }

  //tests that the constructor properly links the Suit
  @Test
  public void testConstructorSuit() {
    assertEquals(Suit.Hearts, heartCopy);
    assertNotEquals(queenHeartsCopy, queenClubs);
    assertNotEquals(fiveHearts, tenHearts);
    assertEquals(aceSpades, aceSpadesCopy);
  }

  @Test
  public void testCompareToEquality() {
    assertEquals(aceSpades, aceSpadesCopy);
    assertEquals(0, aceSpades.compareTo(aceSpadesCopy));
    assertFalse(queenClubs.equals(kingClubs));
    assertFalse(queenClubs.compareTo(kingClubs) == 0);
    assertFalse(queenClubs.equals(queenSpades));
    assertFalse(queenClubs.compareTo(queenSpades) == 0);
    assertFalse(queenClubs.equals(fiveHearts));
    assertFalse(queenClubs.compareTo(fiveHearts) == 0);
  }

  @Test
  public void testComparetoInequality() {
    assertNotEquals(queenClubs, queenSpades);
    assertEquals(1, queenClubs.compareTo(queenSpades));
    assertEquals(1, tenDiamonds.compareTo(tenHearts));
    assertEquals(1, kingClubs.compareTo(kingSpades));
    assertEquals(1, Suit.Clubs.compareSuits(Suit.Spades));
    assertEquals(-1, queenSpades.compareTo(queenClubs));
    assertNotEquals(fiveHearts, tenHearts);
    assertEquals(1, tenHearts.compareTo(fiveHearts));
    assertEquals(-1, fiveHearts.compareTo(tenHearts));
    assertNotEquals(jackSpades, tenDiamonds);
    assertEquals(1, tenDiamonds.compareTo(jackSpades));
    assertEquals(-1, jackSpades.compareTo(tenDiamonds));
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
    assertNotEquals(queenClubs.toString(), queenSpades.toString());
    assertNotEquals(fiveSpades.toString(), fiveHearts.toString());
    assertNotEquals(tenDiamonds, jackSpades);
    assertTrue(queenClubs.toString().contains("♣"));
    assertFalse(kingSpades.toString().contains("♣"));
  }

}
package cs3500.hw02;

import org.junit.Test;
import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by bahar on 5/18/16.
 */
public class PlayerTest {
  List<StandardCard> player1Hand= new ArrayList<StandardCard>();
  Player player1 = new Player();
  StandardCard aceSpades = new StandardCard(Suit.Spades, Rank.Ace);
  StandardCard aceClubs = new StandardCard(Suit.Clubs, Rank.Ace);
    StandardCard aceSpadesCopy = new StandardCard(Suit.Spades, Rank.Ace);
    StandardCard fiveClubs = new StandardCard(Suit.Clubs, Rank.Five);
    StandardCard kingHearts = new StandardCard(Suit.Hearts, Rank.King);
    StandardCard tenHearts = new StandardCard(Suit.Hearts, Rank.Ten);
    StandardCard sixSpades = new StandardCard(Suit.Spades, Rank.Six);
    StandardCard twoDiamonds = new StandardCard(Suit.Diamonds, Rank.Two);

  @Test
  public void testConstructor() {
    assertTrue(player1Hand.isEmpty());
  }

  @Test
  public void addCardTest() {
    player1Hand.add(aceSpades);
    assertEquals(1, player1Hand.size());
  }

  @Test
  public void toStringTest()  {
    player1.addCard(aceSpades);
   assertEquals("A♠, ", player1.toString());
    player1.addCard(aceClubs);
    assertEquals("A♣, A♠, ", player1.toString());
    player1.addCard(aceSpadesCopy);
    assertEquals("A♣, A♠, A♠, ", player1.toString());
    player1.addCard(fiveClubs);
    assertEquals("A♣, 5♣, A♠, A♠, ", player1.toString());
    player1.addCard(kingHearts);
    assertEquals("A♣, 5♣, K♥, A♠, A♠, ", player1.toString());
    player1.addCard(tenHearts);
    assertEquals("A♣, 5♣, K♥, 10♥, A♠, A♠, ", player1.toString());
    player1.addCard(sixSpades);
    player1.addCard(twoDiamonds);
    assertEquals("A♣, 5♣, 2♦, K♥, 10♥, A♠, A♠, 6♠, ", player1.toString());
  }

  //TODO add exceptions for trying to add something already there?

}
package cs3500.hw02;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.*;


/**
 * a class to test the GenericStandardDeckGame
 */
public class GenericStandardDeckGameTest {

  GenericCardGameModel<Card> game1 = new GenericStandardDeckGame();
  List<StandardCard> smallList = new ArrayList<StandardCard>();

  //tests that the deck has 52 cards
  @Test
  public void getDeckContents() {
    assertEquals(52, game1.getDeck().size());
    assertFalse(game1.getDeck().equals(null));

    for (int i = 0; i < game1.getDeck().size(); i++) {
      assertFalse(game1.getDeck().get(i).equals(null));
      System.out.println(game1.getDeck().get(i).toString());
    }
  }

  //tests that there are 4 of each rank
  @Test
  public void getDeckRankCount() {
    int rankTwo = 0;
    int rankThree = 0;
    int rankFour = 0;
    int rankFive = 0;
    int rankSix = 0;
    int rankSeven = 0;
    int rankEight = 0;
    int rankNine = 0;
    int rankTen = 0;
    int rankJack = 0;
    int rankQueen = 0;
    int rankKing = 0;
    int rankAce = 0;

    for (int i = 0; i < StandardCard.DECK_SIZE; i++) {
      String str = game1.getDeck().get(i).toString();

      if (str.contains("2")) {
        rankTwo++;
      }

      else if (str.contains("3")) {
        rankThree++;
      }

      else if (str.contains("4")) {
        rankFour++;
      }

      else if (str.contains("5")) {
        rankFive++;
      }

      else if (str.contains("6")) {
        rankSix++;
      }

      else if (str.contains("7")) {
        rankSeven++;
      }

      else if (str.contains("8")) {
        rankEight++;
      }

      else if (str.contains("9")) {
        rankNine++;
      }

      else if (str.contains("10")) {
        rankTen++;
      }

      else if (str.contains("J")) {
        rankJack++;
      }

      else if (str.contains("Q")) {
        rankQueen++;
      }

      else if (str.contains("K")) {
        rankKing++;
      }

      else if (str.contains("A")) {
        rankAce++;
      }

      assertEquals(4, rankTwo);
      assertEquals(4, rankThree);
      assertEquals(4, rankFour);
      assertEquals(4, rankFive);
      assertEquals(4, rankSix);
      assertEquals(4, rankSeven);
      assertEquals(4, rankEight);
      assertEquals(4, rankNine);
      assertEquals(4, rankTen);
      assertEquals(4, rankJack);
      assertEquals(4, rankQueen);
      assertEquals(4, rankKing);
      assertEquals(4, rankAce);
    }
  }

  //Each suite should appear 13 times
  @Test
  public void testSuitCount() {
    int heartsCount = 0;
    int spadesCount = 0;
    int clubsCount = 0;
    int diamondsCount = 0;

    for(int i = 0; i < StandardCard.DECK_SIZE; i++) {
      String str = game1.getDeck().get(i).toString();
      if (str.contains("♥")) {
        heartsCount++;
      }

      else if (str.contains("♠")) {
        spadesCount++;
      }

      else if (str.contains("♣")) {
        clubsCount++;
      }

      else if (str.contains("♦")) {
        diamondsCount++;
      }
    }

    assertEquals(13, heartsCount);
    assertEquals(13, spadesCount);
    assertEquals(13, clubsCount);
    assertEquals(13, diamondsCount);
  }

  @Test
  public void noDuplicatesGetDeck() {
    List<Card> copiedDeck = new ArrayList<Card>();
    copiedDeck.addAll(this.game1.getDeck());

    for(int i = 0; i < this.game1.getDeck().size(); i++) {
      Card current = copiedDeck.get(i);
      copiedDeck.remove(i);

      for (Card s : copiedDeck) {
        assertFalse(current.equals(s));
      }

      copiedDeck.addAll(this.game1.getDeck());
    }
  }

    @Test
    public void differentDeckEachTime() {
        assertFalse(this.game1.getDeck().equals(this.game1.getDeck()));
    }

  @Test
  public void startPlay() {
     this.game1.startPlay(4, this.game1.getDeck());




  }

  @Test
  public void getGameState() {

  }

}


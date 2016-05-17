package cs3500.hw02;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.*;


/**
 * a class to test the GenericStandardDeckGame
 */
public class GenericStandardDeckGameTest {

  GenericCardGameModel<Suit> game1 = new GenericStandardDeckGame();

  //tests that the deck has 52 cards
  @Test
  public void getDeckLength() {
    assertEquals(game1.getDeck().size(), 52);
  }

  //tests that there are 4 of each rank
  @Test
  public void getDeckRankCount() {
    int rankOne = 0;
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
    for (int i = 0; i < 52; i++) {
      switch (game1.getDeck().get(i).getRankValue()) {
        case 1:
          rankOne++;
          break;
        case 2:
          rankTwo++;
          break;
        case 3:
          rankThree++;
          break;
        case 4:
          rankFour++;
          break;
        case 5:
          rankFive++;
          break;
        case 6:
          rankSix++;
          break;
        case 7:
          rankSeven++;
          break;
        case 8:
          rankEight++;
          break;
        case 9:
          rankNine++;
          break;
        case 10:
          rankTen++;
          break;
        case 11:
          rankJack++;
          break;
        case 12:
          rankQueen++;
          break;
        case 13:
          rankKing++;
          break;
        case 14:
          rankAce++;
          break;
        default:
      }
      assertEquals(4, rankOne);
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

    for(int i = 0; i < 52; i++) {
      String str = game1.getDeck().get(i).toString();
      if (str.contains("Hearts")) {
        heartsCount++;
      }

      else if (str.contains("Spades")) {
        spadesCount++;
      }

      else if (str.contains("Clubs")) {
        clubsCount++;
      }

      else if (str.contains("Diamonds")) {
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
    List<Suit> copiedDeck = new ArrayList<Suit>();
    copiedDeck.addAll(this.game1.getDeck());

    for(int i = 0; i < this.game1.getDeck().size(); i++) {
      Suit current = copiedDeck.get(i);
      copiedDeck.remove(i);

      for (Suit s : copiedDeck) {
        assertFalse(current.equals(s));
      }

      copiedDeck.addAll(this.game1.getDeck());
    }
  }

  @Test
  public void notSorted() {
    List<Suit> copiedDeck = new ArrayList<Suit>();
    copiedDeck.addAll(this.game1.getDeck());

    //sort(copiedDeck); check that the sorted copied deck is not the same as the deck

  }

  @Test
  public void startPlay() {

  }

  @Test
  public void getGameState() {

  }

}


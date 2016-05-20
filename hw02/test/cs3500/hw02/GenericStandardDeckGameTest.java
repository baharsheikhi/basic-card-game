package cs3500.hw02;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.*;


/**
 * a class to test the GenericStandardDeckGame
 */
public class GenericStandardDeckGameTest {

  GenericCardGameModel<StandardCard> game1 = new GenericStandardDeckGame();
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

    for(int i = 0; i < StandardCard.DECK_SIZE; i++) {
      String str = game1.getDeck().get(i).toString();
      if (str.contains("2")) {
        rankTwo++;
      } else if (str.contains("3")) {
        rankThree++;
      } else if (str.contains("4")) {
        rankFour++;
      } else if (str.contains("5")) {
        rankFive++;
      } else if (str.contains("6")) {
        rankSix++;
      } else if (str.contains("7")) {
        rankSeven++;
      } else if (str.contains("8")) {
        rankEight++;
      } else if (str.contains("9")) {
        rankNine++;
      } else if (str.contains("10")) {
        rankTen++;
      } else if (str.contains("J")) {
        rankJack++;
      } else if (str.contains("Q")) {
        rankQueen++;
      } else if (str.contains("K")) {
        rankKing++;
      } else if (str.contains("A")) {
        rankAce++;
      }
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
    List<StandardCard> copiedDeck = new ArrayList<StandardCard>();
    copiedDeck.addAll(this.game1.getDeck());

    List<StandardCard> transferredDeck = new ArrayList<StandardCard>();
    transferredDeck.addAll(this.game1.getDeck());

    for(int i = 0; i < this.game1.getDeck().size(); i++) {
      StandardCard discarded = copiedDeck.remove(0);

      for (StandardCard s : copiedDeck) {
        assertFalse(discarded.equals(s));
      }
    }
  }

    @Test
    public void differentDeckEachTime() {
        List<StandardCard> copiedDeck = new ArrayList<StandardCard>();
        copiedDeck.addAll(this.game1.getDeck());
        assertTrue(this.game1.getDeck().containsAll(copiedDeck));
        boolean isDifferent = false;
        for (int i = 0; i < copiedDeck.size(); i++) {
          if (! copiedDeck.get(i).equals(this.game1.getDeck().get(i))) {
            isDifferent = true;
            break;
          }
        }
        assertTrue(isDifferent);
    }

  @Test
  public void startPlay() {
//     this.game1.startPlay(4, this.game1.getDeck());
  }

  @Test
  public void getGameStateTestCorrectDeck() {
    GenericStandardDeckGame game2 = new GenericStandardDeckGame(2);

    String gameState = game2.getGameState();

      int clubsCount = 0;
      int diamondsCount = 0;
      int heartsCount = 0;
      int spadesCount = 0;

      int twoCount = 0;
      int threeCount = 0;
      int fourCount = 0;
      int fiveCount = 0;
      int sixCount = 0;
      int sevenCount = 0;
      int eightCount = 0;
      int nineCount = 0;
      int tenCount = 0;
      int jackCount = 0;
      int queenCount = 0;
      int kingCount = 0;
      int aceCount = 0;

      for (int i = 0; i < gameState.length(); i++) {
       switch (gameState.charAt(i)) {
           case '♣':
               clubsCount++;
               break;
           case '♦':
               diamondsCount++;
               break;
           case '♥':
               heartsCount++;
               break;
           case '♠':
               spadesCount++;
               break;
           case '2':
               twoCount++;
               break;
           case '3':
               threeCount++;
               break;
           case '4':
               fourCount++;
               break;
           case '5':
               fiveCount++;
               break;
           case '6':
               sixCount++;
               break;
           case '7':
               sevenCount++;
               break;
           case '8':
               eightCount++;
               break;
           case '9':
               nineCount++;
               break;
           case 'J':
               jackCount++;
               break;
           case 'Q':
               queenCount++;
               break;
           case 'K':
               kingCount++;
               break;
           case 'A':
               aceCount++;
               break;
           default:
       }
      }
      assertEquals(13, clubsCount);
      assertEquals(13, diamondsCount);
      assertEquals(13, heartsCount);
      assertEquals(13, spadesCount);
      assertEquals(4, twoCount);
      assertEquals(4, threeCount);
      assertEquals(4, fourCount);
      assertEquals(4, fiveCount);
      assertEquals(4, sixCount);
      assertEquals(4, sevenCount);
      assertEquals(4, eightCount);
      assertEquals(4, nineCount);
      assertEquals(4, tenCount);
      assertEquals(4, jackCount);
      assertEquals(4, queenCount);
      assertEquals(4, kingCount);
      assertEquals(4, aceCount);
  }

    @Test
    public void testGameStatePlayerCards() {
    }

}


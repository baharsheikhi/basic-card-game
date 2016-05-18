package cs3500.hw02;

import java.util.*;

/**
 * Created by bahar on 5/16/16.
 * This is a class to represent a generic standard deck game.
 * It is the foundation of card games and is a general model that can be used for many card games.
 *
 * All these games have some common aspects. They can be played by many players,
 * and they use an entire deck of cards. The deck of cards are distributed among all the players,
 * so that each player has a subset of cards at any time in the game.
 * Players give up their cards as the game progresses, and the game ends when all players
 *  have run out of cards.
 *
 *  NOTE: In this standard deck game ace is the highest value
 */
public class GenericStandardDeckGame implements GenericCardGameModel<Card> {

  @Override
  public List<Card> getDeck() {
    //Random rand = new Random();
    //List<Card> ret = new ArrayList<Card>();
    List<Card> allCards = new ArrayList<Card>();

//    for (int i = 0; i < StandardCard.DECK_SIZE; i++) {
//      ret.add(null);
//    }

    for (int i = StandardCard.MIN_RANK_VALUE; i <= StandardCard.MAX_RANK_VALUE; i++) {
      allCards.add(new StandardCard("Hearts", i));
      allCards.add(new StandardCard("Diamonds", i));
      allCards.add(new StandardCard("Spades", i));
      allCards.add(new StandardCard("Clubs", i));
    }

    Collections.shuffle(allCards);

//    for (Card s: allCards) {
//      int randPos = rand.nextInt(52);
//      while (ret.get(randPos) != null) {
//        randPos = rand.nextInt(52);
//      }
//      ret.add(randPos, s);
//    }

    return allCards;
  }

  @Override
  public void startPlay(int numPlayers, List deck) {

  }

  @Override
  public String getGameState() {
    return null;
  }


  //private final List<Card> deck;
  //private final List<Player> players;


}
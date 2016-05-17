package cs3500.hw02;

import java.util.List;

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
 */
public class GenericStandardDeckGame implements GenericCardGameModel {

  @Override
  public List<Integer> getDeck() {
    return null;
  }

  @Override
  public void startPlay(int numPlayers, List deck) {

  }

  @Override
  public String getGameState() {
    return null;
  }
}

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
    List<Card> allCards = new ArrayList<Card>();

    for (int i = StandardCard.MIN_RANK_VALUE; i <= StandardCard.MAX_RANK_VALUE; i++) {
      allCards.add(new StandardCard(Suit.Hearts, Rank.values()[i]));
      allCards.add(new StandardCard(Suit.Diamonds, Rank.values()[i]));
      allCards.add(new StandardCard(Suit.Spades, Rank.values()[i]));
      allCards.add(new StandardCard(Suit.Clubs, Rank.values()[i]));
    }

    Collections.shuffle(allCards);
    return allCards;
  }

  @Override
  public void startPlay(int numPlayers, List<Card> deck) {
      this.initPlayers(numPlayers);

      for (int i = 0; i < deck.size() - numPlayers; i++) {
          for (Player p: this.players) {
              p.addCard(deck.get(i));
              i++;
          }
      }

  }

  @Override
  public String getGameState() {
    String ret = "Number of players: "+this.players.size()+"/n";

    for (int i = 0; i < this.players.size(); i++) {
      ret+="Player "+(i+1)+": "+players.get(i).toString()+"/n";
    }

    return ret;
  }


  private final List<Card> deck;
  private final List<Player> players;

    /**
     * adds the given number of players to this game's list of players
     * @param numPlayers
     */
    protected void initPlayers(int numPlayers) {
      for (int i = 0; i < numPlayers; i++) {
          players.add(new StandardPlayer());
      }
  }

    GenericStandardDeckGame(int numPlayers) {
        this.deck = this.getDeck();
        this.players = new ArrayList<Player>();
        this.startPlay(numPlayers, this.deck);
    }

    public GenericStandardDeckGame() {
        this.deck = new ArrayList<Card>();
        this.players = new ArrayList<Player>();
    }

}

//TODO REMOVE THE STRING CONSTRUCTOR FOR CARDS
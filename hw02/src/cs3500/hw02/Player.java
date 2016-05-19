package cs3500.hw02; /**
 * Created by baharsheikhi on 5/18/16.
 */

import java.util.*;

/**
 * to represent a player that plays a standard card game
 */
public class Player{
    //TODO IS IT BAD THAT MY PLAYER CAN HAVE A HAND OF ANY CARDS

    public void addCard(Card c) {
        this.hand.add(c);

    }

    public Card removeCard(Card c) {
        int pos = this.hand.indexOf(c);
        return this.hand.remove(pos);
    }


    public int countCards() {

        return this.hand.size();
    }

    @Override
    public String toString() {
      String str = "";
      Collections.sort(this.hand);
      for (Card c : this.hand) {
        str+=c.toString()+", ";
      }

      return str;
    }

    private final List<Card> hand;

    /**
     * creates a standard player with an empty list of cards
     */
    public Player() {
        this.hand = new ArrayList<Card>();
    }


}

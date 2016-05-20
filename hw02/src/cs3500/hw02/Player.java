package cs3500.hw02; /**
 * Created by baharsheikhi on 5/18/16.
 */

import java.util.*;

/**
 * to represent a player that plays a standard card game
 */
public class Player{

    public void addCard(StandardCard c) {
        this.hand.add(c);

    }

    public StandardCard removeCard(StandardCard c) {
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
      for (StandardCard c : this.hand) {
        str+=c.toString()+", ";
      }

      return str;
    }

    private final List<StandardCard> hand;

    /**
     * creates a standard player with an empty list of cards
     */
    public Player() {
        this.hand = new ArrayList<StandardCard>();
    }


}

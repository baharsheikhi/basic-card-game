package cs3500.hw02; /**
 * Created by baharsheikhi on 5/18/16.
 */
import cs3500.hw02.Player;

import java.util.*;

/**
 * to represent a player that plays a standard card game
 */
public class StandardPlayer implements Player {

    @Override
    public void addCard(Card c) {
        this.hand.add(c);

    }

    @Override
    public Card removeCard(Card c) {
        int pos = this.hand.indexOf(c);
        return this.hand.remove(pos);
    }

    @Override
    public int countCards() {
        return this.hand.size();
    }

    private final List<Card> hand;

    /**
     * creates a standard player with an empty list of cards
     */
    StandardPlayer() {
        this.hand = new ArrayList<Card>();
    }


}

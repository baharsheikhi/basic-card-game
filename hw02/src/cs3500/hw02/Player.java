package cs3500.hw02;

/**
 * Created by baharsheikhi on 5/18/16.
 */
public interface Player {

    /**
     *
     * @param c the card to be added to the end of the player's hand
     */
    public void addCard(Card c);

    /**
     *
     * @param c removes the card at the given position in the player's hand
     *          based on the first occurance of the card
     */
    public Card removeCard(Card c);

    /**
     *
     * @return the number of cards in the player's hand
     */
    public int countCards();

}

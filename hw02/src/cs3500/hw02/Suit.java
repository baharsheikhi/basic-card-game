package cs3500.hw02;

/**
 * An interface to represent suits, of which there are 4 kinds: Diamonds, Clubs, Spades, and
 * Hearts
 */
public interface Suit {

}

/**
 * An abstract class to represent a suit
 */
abstract class ASuit implements Suit {
  /**
   * Constructs a suit based on its rank
   * @param rank the rank that the suit will have
   */
  ASuit(Rank rank) {
    this.rank = rank;
  }

  private final Rank rank;
}

package cs3500.hw02;

/**
 * An interface to represent suits, of which there are 4 kinds: Diamonds, Clubs, Spades, and
 * Hearts
 */
public interface Suit {
  /**
   *
   * @return the rank of this suit
   */
  public int getRankValue();
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

  @Override
  public int getRankValue() {
    return this.rank.getValue();
  }

  @Override
  public String toString() {
      return this.toStringHelp();
    }

  /**
   *to help abstract the toString method
   */
  protected abstract String toStringHelp();

  //TODO .equals for suits
}

package cs3500.hw02;

/**
 * To represent the spade suit
 */
public final class Spades extends ASuit {

  /**
   * Constructs a suit based on its rank
   *
   * @param rank the rank that the suit will have
   */
  Spades(Rank rank) {
    super(rank);
  }

  @Override
  protected String toStringHelp() {
    return String.format("%d of Spades", this.getRankValue());
  }
}

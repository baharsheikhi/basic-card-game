package cs3500.hw02;

/**
 * to represent the diamonds suit
 */
public final class Diamonds extends ASuit {

  /**
   * Constructs a suit based on its rank
   *
   * @param rank the rank that the suit will have
   */
  Diamonds(Rank rank) {
    super(rank);
  }

  @Override
  protected String toStringHelp() {
    return String.format("%d of Diamonds", this.getRankValue());
  }
}

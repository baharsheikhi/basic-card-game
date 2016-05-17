package cs3500.hw02;

/**
 * to represent the Club suit
 */
public final class Clubs extends ASuit {

  /**
   * Constructs a suit based on its rank
   *
   * @param rank the rank that the suit will have
   */
  Clubs(Rank rank) {
    super(rank);
  }

  @Override
  protected String toStringHelp() {
    return String.format("%d of Clubs", this.getRankValue());
  }
}

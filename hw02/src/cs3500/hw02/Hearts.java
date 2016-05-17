package cs3500.hw02;

/**
 * To represent the heart suit
 */
public final class Hearts extends ASuit {

  public Hearts(Rank rank) {
    super(rank);
  }

  @Override
  protected String toStringHelp() {
    return String.format("%d of Hearts", this.getRankValue());
  }

}

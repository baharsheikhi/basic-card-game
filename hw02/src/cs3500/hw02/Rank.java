package cs3500.hw02;

/**
 * Created by bahar on 5/16/16.
 * An enumeration to represents suits of cards
 */
public enum Rank {
  Two("2"), Three("3"), Four("4"), Five("5"), Six("6"), Seven("7"), Eight("8"), Nine("9"), Ten("10"),
  Jack("J"), Queen("Q"), King("K"), Ace("A");

  /**
   * Constructs a rank based on its value
   * @param value the value of the rank
   */
  Rank(String value) {
    this.value = value;
  }

  private final String value;

  /**
   *
   * @return the value of the Rank
   */
  public String toString() {
    return this.value;
  }


}



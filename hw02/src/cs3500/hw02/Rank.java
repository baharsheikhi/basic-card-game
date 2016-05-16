package cs3500.hw02;

/**
 * Created by bahar on 5/16/16.
 * An enumeration to represents suits of cards
 */
public enum Rank {
  One(1), Two(2), Three(3), Four(4), Five(5), Six(6), Seven(7), Eight(8), Nine(9), Ten(10),
  Jack(11), Queen(12), King(13), Ace(14);

  /**
   * Constructs a rank based on its value
   * @param value the value of the rank
   */
  Rank(int value) {
    this.value = value;
  }

  private final int value;


}



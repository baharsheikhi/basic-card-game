package cs3500.hw02;

/**
 * An enumeration to represent suits of a card
 */
public enum Suit {
  Hearts, Spades, Diamonds, Clubs;

  @Override
  public String toString() {
    String ret = "";
    switch (this) {
      case Hearts:
        ret+="♥";
        break;
      case Spades:
        ret+="♠";
        break;
      case Diamonds:
        ret+="♦";
        break;
      case Clubs:
        ret+="♣";
        break;
      default:
    }

    return ret;
  }
}

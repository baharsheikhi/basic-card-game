package cs3500.hw02;

/**
 * A class to represent a standard card. It can be ranks 2-Ace with the four suits. Jokers are
 * excluded.
 */
public class StandardCard implements Card {

  /**
   *
   * @param suit The suit as a String (plural form ie. "Hearts", "Spades", "Diamonds", "Hearts"
   * @param rank The rank as a String 2-10, numbers in double quotes ie. "2", "3". The remaining
   *             ranks should be spelled out ie. "King", "Jack", "Queen", "Ace"
   */
  StandardCard(String suit, String rank) {
    switch (suit) {
      case "Heart":
        this.suit = Suit.Hearts;
        break;
      case "Diamonds":
        this.suit = Suit.Diamonds;
        break;
      case "Clubs":
        this.suit = Suit.Clubs;
        break;
      case "Spades":
        this.suit = Suit.Spades;
        break;
      default: throw new IllegalArgumentException("Please enter a valid suit");
    }

    switch (rank) {
      case "2":
        this.rank = Rank.Two;
        break;
      case "3":
        this.rank = Rank.Three;
        break;
      case "4":
        this.rank = Rank.Four;
        break;
      case "5":
        this.rank = Rank.Five;
        break;
      case "6":
        this.rank = Rank.Six;
        break;
      case "7":
        this.rank = Rank.Seven;
        break;
      case "8":
        this.rank = Rank.Eight;
        break;
      case "9":
        this.rank = Rank.Nine;
        break;
      case "10":
        this.rank = Rank.Ten;
        break;
      case "Jack":
        this.rank = Rank.Jack;
        break;
      case "Queen":
        this.rank = Rank.Queen;
        break;
      case "King":
        this.rank = Rank.King;
        break;
      case "Ace":
        this.rank = Rank.Ace;
        break;
      default: throw new IllegalArgumentException("Please enter a valid rank");
    }
  }

  /**
   *
   * @param suit The suit as a String (plural form ie. "Hearts", "Spades", "Diamonds", "Hearts"
   * @param rank The rank represented as an integer: from 2-14. 2-10 represent their respective
   *             ranks. 11 represents Jack, 12 represents Queen, 13 represents King, 14 represents
   *             Ace.
   */
  StandardCard(String suit, int rank) {
    switch (suit) {
      case "Hearts":
        this.suit = Suit.Hearts;
        break;
      case "Diamonds":
        this.suit = Suit.Diamonds;
        break;
      case "Clubs":
        this.suit = Suit.Clubs;
        break;
      case "Spades":
        this.suit = Suit.Spades;
        break;
      default: throw new IllegalArgumentException("Please enter a valid suit");
    }

    switch (rank) {
      case 2:
        this.rank = Rank.Two;
        break;
      case 3:
        this.rank = Rank.Three;
        break;
      case 4:
        this.rank = Rank.Four;
        break;
      case 5:
        this.rank = Rank.Five;
        break;
      case 6:
        this.rank = Rank.Six;
        break;
      case 7:
        this.rank = Rank.Seven;
        break;
      case 8:
        this.rank = Rank.Eight;
        break;
      case 9:
        this.rank = Rank.Nine;
        break;
      case 10:
        this.rank = Rank.Ten;
        break;
      case 11:
        this.rank = Rank.Jack;
        break;
      case 12:
        this.rank = Rank.Queen;
        break;
      case 13:
        this.rank = Rank.King;
        break;
      case 14:
        this.rank = Rank.Ace;
        break;
      default: throw new IllegalArgumentException("Please enter a integer to represent ranks");
    }
  }

  private final Rank rank;
  private final Suit suit;
  public static final int MAX_RANK_VALUE = 14;
  public static final int MIN_RANK_VALUE = 2;
  public static final int DECK_SIZE = 52;

  @Override
  public String toString() {
    String ret = "";
    ret+= this.rank.toString();
    ret+= this.suit.toString();

    return ret;
  }

//  @Override
//  public String toString() {
//      return this.toStringHelp();
//    }

  /**
   *to help abstract the toString method
   */
  //TODO protected abstract String toStringHelp();

  //TODO .equals for suits
}

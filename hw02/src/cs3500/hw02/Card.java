package cs3500.hw02;

import com.sun.xml.internal.bind.api.impl.NameConverter;
import java.util.*;
/**
 * An interface to represent suits, of which there are 4 kinds: Diamonds, Clubs, Spades, and
 * Hearts
 */
public interface Card extends Comparable<Card>{

  @Override
  public int compareTo(Card c);
}


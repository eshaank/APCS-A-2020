package ElevensLab;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//make a Deck class
class Deck {
	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");

	private List<Card> cards;
	private int top;

	// make a Deck constructor
	// refer cards to new ArrayList
	// set top to the top of the deck 51

	// loop through all suits
	// loop through all faces 1 to 13
	// add a new TwentyOneCard to the deck
	public Deck() {
		top = 0;
		cards = new ArrayList<Card>();

		for (int i = 0; i < 4; i++) {
			for (int k = 1; k <= 13; k++) {
				cards.add(new Card(SUITS[i], k));
			}
		}
	}



	// make a dealCard() method that returns the top card
	public Card dealCard() {

		if (top > 51) {
			top = 0;
		}
		Card card = cards.get(top);
		top++;
		return card;
	}

	// write a shuffle() method
	// use Colletions.shuffle
	// reset the top card
	public void shuffle() {
		Collections.shuffle(cards);
		top = 0;

	}

	public boolean isEmpty() {
		return cards.isEmpty();
	}

	public int size() {
		return cards.size();
	}

}
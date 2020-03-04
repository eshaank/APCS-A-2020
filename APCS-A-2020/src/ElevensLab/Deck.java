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
	private int size;

	// make a Deck constructor
	// refer cards to new ArrayList
	// set top to the top of the deck 51

	// loop through all suits
	// loop through all faces 1 to 13
	// add a new TwentyOneCard to the deck
	public Deck() {
		top = size - 1;
		cards = new ArrayList<Card>();

		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 13; j++) {
				cards.add(0, new Card(SUITS[i], j));
			}
		}
	}

	public Deck(String[] ranks, String[] suits, int[] values) {
		
		cards = new ArrayList<Card>();

		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 13; j++) {
				cards.add(0, new Card(SUITS[i], j));
			}
		}
		size = cards.size();
		top = size - 1;
		shuffle();
	}

	// make a dealCard() method that returns the top card
	public Card dealCard() {
		Card card = null;
		if (size == 0) {
			return card;
		}
		if (top < 0) {
			resetTop();
			top = size - 1;
		}
		if (top >= 0) {
			card = cards.get(top);
			top--;
			size--;
		}
		return card;
	}

	// write a shuffle() method
	// use Colletions.shuffle
	// reset the top card
	public void shuffle() {
		resetTop();
		// Shuffler.perfectShuffle(cards);
		// Shuffler.selectionShuffle(cards);
		Collections.shuffle(cards);

	}

	public void resetTop() {
		size = cards.size();
		top = cards.size() - 1;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public int size() {
		return cards.size();
	}

	public String toString() {
		String output = "size = " + size + "\nUndealt cards: \n";
		for (int i = size - 1; i >= 0; i--) {
			if (i > 0) {
				output += cards.get(i) + ", ";
			} else
				output += cards.get(i) + "\n";
		}
		output += "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			if (k > size) {
				output += cards.get(k) + ", ";
			} else
				output += cards.get(k) + "\n";

		}
		return output;
	}

}
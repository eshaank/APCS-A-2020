package ElevensLab;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

public class Card {

	public static final String FACES[] = { "ZERO", "ACE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT",
			"NINE", "TEN", "JACK", "QUEEN", "KING" };

	// instance variables
	// String suit
	// int face
	private String suit;
	private int face;
	private String rank;
	private int pointValue;

	// constructors
	public Card(String s, int f) {
		// TODO Auto-generated constructor stub
		setSuit(s);
		setFace(f);
	}

	public Card(String cardRank, String cardSuit, int cardPointValue) {
		suit = cardSuit;
		rank = cardRank;
		pointValue = cardPointValue;
	}

	// modifiers
	// set methods
	public void setSuit(String s) {
		suit = s;
	}

	public void setFace(int f) {
		face = f;
	}

	// accessors
	// get methods
	public String getSuit() {
		return suit;
	}

	public int getFace() {
		return face;
	}

	public String getRank() {
		return rank;
	}

	public int getPointValue() {
		return pointValue;
	}

	public boolean matches(Card otherCard) {
		if(this.getSuit().equals(otherCard.getSuit()) && this.getRank().equals(otherCard.getRank()) && this.getPointValue() == otherCard.getPointValue()) {
			return true;
		}
		else if(this.getSuit().equals(otherCard.getSuit()) && this.getPointValue() == otherCard.getPointValue()) {
			return true;
		}
		else {
			return false;
		}
	}

	// toString
	public String toString() {
		String output = "";
		output = FACES[getFace()] + " of " + getSuit();
		return output;
	}

}
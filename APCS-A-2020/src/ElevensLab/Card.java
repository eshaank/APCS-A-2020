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

	// constructors
	public Card(String s, int f) {
		// TODO Auto-generated constructor stub
		setSuit(s);
		setFace(f);
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


	// toString
	public String toString() {
		String output = "";
		output = FACES[getFace()] + " of " + getSuit();
		return output;
	}

}
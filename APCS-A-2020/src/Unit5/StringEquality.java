package Unit5;
//(c) A+ Computer Science
import static java.lang.System.*;

public class StringEquality {
	private String wordOne, wordTwo;

	public StringEquality() {
		wordOne = "hello";
		wordTwo = "bye";
	}

	public StringEquality(String one, String two) {
		wordOne = one;
		wordTwo = two;
	}

	public void setWords(String one, String two) {
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkEquality() {
		if(wordOne.compareTo(wordTwo) == 0) {
			return true;
		}
		return false;
	}

	public String toString() {
		if(checkEquality() == true) {
			return wordOne + " has the same letters as " + wordTwo + "\n";
		}
		return wordOne + " does not have the same letters as " + wordTwo + "\n";
	}
}
package Unit6;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover {
	private String sentence;
	private char lookFor;

	public LetterRemover() {
		// call set
	}

	public LetterRemover(String a, char rem) {
		sentence = a;
		lookFor = rem;
	}

	public void setRemover(String s, char rem) {
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		int location = cleaned.indexOf(lookFor);
		while(location >= 0) {
			sentence = sentence .substring(0, location) + sentence.substring(location + 1);
			location = sentence.indexOf(lookFor);
		}
		
		return cleaned;
	}

	public String toString() {
		return sentence + " - letter to remove " + lookFor;
	}
}
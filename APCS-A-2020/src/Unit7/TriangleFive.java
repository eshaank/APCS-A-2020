package Unit7;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive {
	private char letter;
	private int amount;

	public TriangleFive() {
		letter = 'B';
		amount = 5;
	}

	public TriangleFive(char c, int amt) {
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c) {
		letter = c;
	}

	public void setAmount(int amt) {
		amount = amt;
	}

	public String toString() {
		String output = "";
		char holder = letter;
		int amount2 = amount;
		int amount3 = amount;

		for (int i = 0; i < amount; i++) {
			amount2 = amount;
			holder = letter;
			for (int x = 0; x < amount3; x++) {
				for (int a = 0; a < amount2; a++) {
					output = output + holder;
				}
				amount2 -= 1;
				if (holder == 'Z') {
					holder = 'A';
				} else {
					holder = (char) (holder + 1);
				}
				output = output + " ";
			}
			amount3 -= 1;
			output = output + "\n";
		}

		return output;
	}
}
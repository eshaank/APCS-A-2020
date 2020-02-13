package Unit6;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect {
	private int number;

	// add constructors
	public Perfect() {
		number = 10;
	}
	public Perfect(int num) {
		number = num;
	}

	// add a set method
	void setNumber(int num) {
		number = num;
	}

	public boolean isPerfect() {
		int count = 2;
		int sum = 1;
		do {
			if(number % count == 0) {
				sum += count;
				count ++;
			}
		} while(count < number);
		
		if(sum == number) {
			return true;
		}
		return false;
	}

	// add a toString
	public String toString() {
		if(isPerfect()) {
			return number + " is perfect \n";
		}
		return number + " is not perfect \n";
	}
}
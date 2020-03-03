package Unit11;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import static java.lang.System.*;

class Rational implements Comparable<Rational> {
	// add two instance variables
	private int numerator;
	private int denominator;
	// write two constructors

	public Rational() {
		numerator = 1;
		denominator = 2;
	}


	

	public Rational(int i, int j) {
		
	}

	public void add(Rational other) {
		// num1/den1 + num2/den2
		// new numerator = (num1 * den2 + num2 * den1)
		// new denominator = (den1 * den2)

		reduce();
	}

	private void reduce() {

	}

	private int gcd(int numOne, int numTwo) {
		int min = Math.min(numOne, numTwo);
		for (int x = min; x > 1; x--) {
			if(numOne%x == 0 && numTwo%x == 0) {
				return x;
			}
			return 1;
		}

		return 1;
	}

	public Object clone() {
		return "";
	}

	// ACCESSORS

	// write get methods for numerator and denominator

	public boolean equals(Object obj) {

		return false;
	}

	public int compareTo(Rational other) {

		return -1;
	}

	// write a setRational method
	public void setRational(int num1, int num2) {

	}
	
	// write a set method for numerator and denominator
	public void setDenom(int d) {
		denominator = d;
	}
	public void setNumer(int n) {
		numerator = n;
	}

	// write toString() method
	public String toString() {
		return "";
	}

}
package Unit11;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import static java.lang.System.*;

class Rational implements Comparable<Rational> {
	// add two instance variables
	private double num;
	private double dem;
	// write two constructors

	public Rational() {
		num = 1;
		dem = 2;
	}
	// write a setRational method

	// write a set method for numerator and denominator

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

	public void setRational(int num1, int num2) {

	}

	// write toString() method
	public String toString() {
		return "";
	}

}
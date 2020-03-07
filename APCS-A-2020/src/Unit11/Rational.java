package Unit11;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import static java.lang.System.*;

class Rational implements Comparable<Rational> {
	// add two instance variables
	private int num, den;

	// write two constructors
	public Rational() {
		setNumerator(1);
		setDenominator(1);
	}

	public Rational(int num1, int den1) {
		setNumerator(num1);
		setDenominator(den1);
	}

	// write a setRational method
	public void setRational(int num1, int den1) {
		setNumerator(num1);
		setDenominator(den1);
		reduce();
	}

	// write a set method for numerator and denominator
	public void setNumerator(int num1) {
		num = num1;
	}

	public void setDenominator(int den1) {
		den = den1;
	}

	public void add(Rational other) {
		// num1/den1 + num2/den2
		// new numerator = (num1 * den2 + num2 * den1)
		// new denominator = (den1 * den2)
		num = (num * other.den + other.num * den);
		den = (den * other.den);
		reduce();
	}

	private void reduce() {

		int gcd = gcd(num, den);
		num /= gcd;
		den /= gcd;

	}

	private int gcd(int numOne, int numTwo) {
		int gcd = 1;
		int smaller = numOne;
		if (numOne > numTwo) {
			smaller = numTwo;
		}
		for (int i = 1; i <= smaller; i++) {
			if (numOne % i == 0 && numTwo % i == 0) {
				gcd = i;
			}
		}

		return gcd;
	}

	public Object clone() {
		return this;
	}

	// ACCESSORS

	// write get methods for numerator and denominator
	public int getNumerator() {
		return num;
	}

	public int getDenominator() {
		return den;
	}

	public boolean equals(Object obj) {

		if (obj instanceof Rational) {
			Rational compare = (Rational) obj;
			return compare.getDenominator() == den && compare.getNumerator() == num;
		}

		return false;
	}

	public int compareTo(Rational other) {

		if (equals(other)) {
			return 0;
		}
		double frac = (double) num / den;
		double otherFrac = (double) other.num / other.den;
		if ((double) otherFrac < (double) frac) {
			return 1;
		}
		return -1;
	}

	// write toString() method
	public String toString() {
		return num + "/" + den;
	}

}
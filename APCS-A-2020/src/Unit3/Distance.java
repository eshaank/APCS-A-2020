package Unit3;
//(c) A+ Computer Science 

//www.apluscompsci.com

//Name - Eshaan Kansagara
//Date - 2/5/2020

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance {
	private int xOne, yOne, xTwo, yTwo;
	private double distance;

	public Distance() {
		xOne = 0;
		xTwo = 0;
		yOne = 0;
		yTwo = 0;
		distance = 0;

	}

	public Distance(int x1, int y1, int x2, int y2) {
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
		distance = 0;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2) {
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calcDistance() {
		distance = Math.sqrt(Math.pow(xTwo - xOne, 2) + Math.pow(yTwo - yOne, 2));
	}

	public void printCoords() {
		System.out.println("X1: " + xOne);
		System.out.println("Y1: " + yOne);
		System.out.println("X2: " + xTwo);
		System.out.println("Y2: " + yTwo);
	}

	public double getDistance() {
		return distance;
	}

	public void print() {
		System.out.printf("distance == %.3f", getDistance());
		System.out.println("\n\n");
	}

	// complete print or the toString

	public String toString() {
		return "";
	}
}
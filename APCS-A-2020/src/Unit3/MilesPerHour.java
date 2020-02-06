package Unit3;
//(c) A+ Computer Science

//www.apluscompsci.com

//Name - Eshaan Kansagara
//Date - 2/5/2020

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour {
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour() {
		setNums(0, 0, 0);
		mph = 0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins) {
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void setNums(int dist, int hrs, int mins) {
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH() {
		double minConversion = minutes / 60.0;
		double time = hours + minConversion;
		mph = distance / time;
	}

	public void print() {
		String message = String.format("%.0f", mph);
		System.out.println(
				distance + " miles in " + hours + " hour and " + minutes + " minutes = " + message + " MPH. \n");
		

	}

	// create a print or toString or both

	public String toString() {
		return "";
	}
}
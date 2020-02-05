package Unit3;
//(c) A+ Computer Science

//www.apluscompsci.com

//Name - Eshaan Kansagara
//Date - 2/5/2020

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(in);

		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		MilesPerHour test = new MilesPerHour(dist, hrs, mins);
		test.calcMPH();
		test.print();

		// add more test cases

	}
}
package Unit3;
//(c) A+ Computer Science

//www.apluscompsci.com

//Name - Eshaan Kansagara
//Date - 2/5/2020

import java.util.Scanner;

public class DistanceRunner {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int x1, y1, x2, y2;

		System.out.print("Enter X1 :: ");
		x1 = keyboard.nextInt();
		System.out.print("Enter Y1 :: ");
		y1 = keyboard.nextInt();
		System.out.print("Enter X2 :: ");
		x2 = keyboard.nextInt();
		System.out.print("Enter Y2 :: ");
		y2 = keyboard.nextInt();

		// Sample Data - :
		// 1 1 2 1
		// 1 1 -2 2
		// 1 1 0 0
		Distance dist = new Distance(x1, y1, x2, y2);
		dist.calcDistance();
		dist.print();

		System.out.println("Sample Data :: ");

		dist.setCoordinates(1, 1, 2, 1);
		dist.calcDistance();
		dist.printCoords();
		dist.print();

		dist.setCoordinates(1, 1, -2, 2);
		dist.calcDistance();
		dist.printCoords();
		dist.print();

		dist.setCoordinates(1, 1, 0, 0);
		dist.calcDistance();
		dist.printCoords();
		dist.print();

	}
}
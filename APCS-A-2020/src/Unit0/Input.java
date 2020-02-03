package Unit0;
//(c) A+ Computer Science

//www.apluscompsci.com

//Name - Eshaan Kansagara
//Date - 2/2/2020
//Class - AP CSA
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Input {
	public static void main(String[] args) {

		System.out.print("Eshaan Kansagara \t  2/2/20 \n\n");

		Scanner keyboard = new Scanner(System.in);

		int intOne, intTwo;
		double doubleOne, doubleTwo;
		float floatOne, floatTwo;
		short shortOne, shortTwo;

		
		//Assigning integer
		System.out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();

		System.out.print("Enter an integer :: ");
		intTwo = keyboard.nextInt();

		
		
		//Assigning double
		System.out.println();
		System.out.print("Enter a double :: ");
		doubleOne = keyboard.nextDouble();

		System.out.print("Enter a double :: ");
		doubleTwo = keyboard.nextDouble();
		
		
		
		//Assigning float
		System.out.println();
		System.out.print("Enter a float :: ");
		floatOne = keyboard.nextFloat();

		System.out.print("Enter a float :: ");
		floatTwo = keyboard.nextFloat();
		
		
		
		//Assigning short
		System.out.println();
		System.out.print("Enter a short :: ");
		shortOne = keyboard.nextShort();

		System.out.print("Enter a short :: ");
		shortTwo = keyboard.nextShort();
		
		
		// add in input for all variables

		
		//Printing integer
		System.out.println();
		System.out.println("integer one = " + intOne);
		System.out.println("integer two = " + intTwo);

		// add in output for all variables
		
		//Printing double
		System.out.println();
		System.out.println("double one = " + doubleOne);
		System.out.println("double two = " + doubleTwo);
		
		//Printing float
		System.out.println();
		System.out.println("float one = " + floatOne);
		System.out.println("float two = " + floatTwo);
		
		//Printing short
		System.out.println();
		System.out.println("short one = " + shortOne);
		System.out.println("short two = " + shortTwo);

	}
}
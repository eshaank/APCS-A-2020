package Unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		Scanner keyboard = new Scanner(System.in);
		
		out.println("Enter a whole number :: ");
		int num = keyboard.nextInt();
		
		System.out.println(num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println(num + " is even :: " + NumberVerify.isEven(num));
		
		//add in more test cases
		System.out.println("\n\n\t\tTest Cases\n");
		
		//111
		System.out.println("111 is odd :: " + NumberVerify.isOdd(111));
		System.out.println("111 is even :: " + NumberVerify.isEven(111) + "\n");
		
		//2000
		System.out.println("2000 is odd :: " + NumberVerify.isOdd(2000));
		System.out.println("2000 is even :: " + NumberVerify.isEven(2000) + "\n");
		
		//-99
		System.out.println("-99 is odd :: " + NumberVerify.isOdd(-99));
		System.out.println("-99 is even :: " + NumberVerify.isEven(-99) + "\n");
		
		//1111
		System.out.println("1111 is odd :: " + NumberVerify.isOdd(1111));
		System.out.println("1111 is even :: " + NumberVerify.isEven(1111) + "\n");
		
		//-850
		System.out.println("-850 is odd :: " + NumberVerify.isOdd(-850));
		System.out.println("-850 is even :: " + NumberVerify.isEven(-850) + "\n");
	}
	
}
package Unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		Discount disc = new Discount();
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		
		System.out.printf("Bill after discount :: %.2f" , disc.getDiscountedBill(amt));
		
		System.out.println("\n\nTest Cases :: \n\n");
		//500
		System.out.printf("Bill after discount :: %.2f \n\n" , disc.getDiscountedBill(500));
		//2500
		System.out.printf("Bill after discount :: %.2f \n\n" , disc.getDiscountedBill(2500));
		//4000
		System.out.printf("Bill after discount :: %.2f \n\n" , disc.getDiscountedBill(4000));
		//333.333
		System.out.printf("Bill after discount :: %.2f \n\n" , disc.getDiscountedBill(333.333));
		//95874.2154
		System.out.printf("Bill after discount :: %.2f" , disc.getDiscountedBill(95874.2154));
		

	}
}
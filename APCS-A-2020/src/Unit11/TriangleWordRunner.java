package Unit11;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		String choice = "";
		do {
			out.print("\nEnter the word to display :: ");
			String word = keyboard.next();

			TriangleWord.printTriangle(word);

			System.out.print("\nDo you want to enter more sample input? ");
			choice = keyboard.next();
		} while (choice.equals("Y") || choice.equals("y"));
		TriangleWord.printTriangle("it");
		TriangleWord.printTriangle("box");
		TriangleWord.printTriangle("toad");
		TriangleWord.printTriangle("fishy");
		TriangleWord.printTriangle("dog");
	}
}
package Unit11;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;

public class DoggiesRunner {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("How many Dogs are in the pack? :: ");
		int size = keyboard.nextInt();
		Doggies pack = new Doggies(size);

		for (int i = 0; i < size; i++) {
			System.out.print("Enter the age :: ");
			int age = keyboard.nextInt();
			System.out.print("Enter the name :: ");
			String name = keyboard.next();
			pack.set(i, age, name);
		}
		System.out.println("pack :: " + pack);
		System.out.println("NAME OF OLDEST :: " + pack.getNameOfOldest());
		System.out.println("NAME OF YOUNGEST :: " + pack.getNameOfYoungest());

		System.out.println("Test Cases\n\n");
		Doggies dog = new Doggies(5);
		dog.set(0, 20, "Sammy");
		dog.set(1, 10, "Benny");
		dog.set(2, 5, "Wilee");
		dog.set(3, 30, "Kelley");
		dog.set(4, 2, "Baby");
		System.out.println("pack :: " + dog);
		System.out.println("NAME OF OLDEST :: " + dog.getNameOfOldest());
		System.out.println("NAME OF YOUNGEST :: " + dog.getNameOfYoungest());

	}
}
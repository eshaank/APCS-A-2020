package Unit10;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -
import static java.lang.System.out;

import java.util.Scanner;

public class ToyRunner {
	public static void main(String[] args) {
		Toy toy = new Toy("sorry");
		toy.setCount(1);
		System.out.println(toy);
		
		toy.setName("gi joe");
		toy.setCount(5);
		System.out.println(toy);
	}
}
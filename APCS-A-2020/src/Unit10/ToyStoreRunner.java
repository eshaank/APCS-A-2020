package Unit10;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner {
	public static void main(String args[]) {
		ToyStore8 sto = new ToyStore8();
		System.out.println(sto.myName());
		System.out.println(sto);
		sto.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball");
		System.out.println(sto);
		System.out.println("max == " + sto.getMostFrequentToy());
	}
}
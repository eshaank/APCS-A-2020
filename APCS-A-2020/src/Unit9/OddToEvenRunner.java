package Unit9;

import java.util.ArrayList;
import java.util.Arrays;

//(c) A+ Computer Science

//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner {
	public static void main(String args[]) {

//				[32767,70,4,5,6,7]
//				[2,7,11,21,5,7]
//				[7,255,11,255,100,3,2]
//				[9,11,11,11,7,1000,3]
//				[7,7,7,11,2,7,7,11,11,2]
//				[2,4,6,8,8]
		ArrayList<Integer> ray1 = new ArrayList<Integer>(Arrays.asList(7,1,5,3,11,5,6,7,8,9,10,12345,11));
		ArrayList<Integer> ray2 = new ArrayList<Integer>(Arrays.asList(11,9,8,7,6,5,4,3,2,1,-99,7));
		ArrayList<Integer> ray3 = new ArrayList<Integer>(Arrays.asList(10,20,30,40,5,41,31,20,11,7));
		ArrayList<Integer> ray4 = new ArrayList<Integer>(Arrays.asList(32767,70,4,5,6,7));
		ArrayList<Integer> ray5 = new ArrayList<Integer>(Arrays.asList(2,7,11,21,5,7));
		ArrayList<Integer> ray6 = new ArrayList<Integer>(Arrays.asList(7,255,11,255,100,3,2));
		ArrayList<Integer> ray7 = new ArrayList<Integer>(Arrays.asList(9,11,11,11,7,1000,3));
		ArrayList<Integer> ray8 = new ArrayList<Integer>(Arrays.asList(7,7,7,11,2,7,7,11,11,2));
		ArrayList<Integer> ray9 = new ArrayList<Integer>(Arrays.asList(2,4,6,8,8));
		
		
		System.out.println(ListOddToEven.go(ray1));
		System.out.println(ListOddToEven.go(ray2));
		System.out.println(ListOddToEven.go(ray3));
		System.out.println(ListOddToEven.go(ray4));
		System.out.println(ListOddToEven.go(ray5));
		System.out.println(ListOddToEven.go(ray6));
		System.out.println(ListOddToEven.go(ray7));
		System.out.println(ListOddToEven.go(ray8));
		System.out.println(ListOddToEven.go(ray9));
	}
	
}
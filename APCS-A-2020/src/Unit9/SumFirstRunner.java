package Unit9;
//(c) A+ Computer Science

import java.util.ArrayList;
import java.util.Arrays;

//www.apluscompsci.com
//Name -
//Date -

public class SumFirstRunner {
	public static void main(String args[]) {

//				[12,15,18,21,23,1000]
//				[250,19,17,15,13,11,10,9,6,3,2,1,0]
//				[9,10,-8,10000,-5000,-3000]
		ArrayList<Integer> ray1 = new ArrayList<Integer>(Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,5));
		ArrayList<Integer> ray2 = new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99));
		ArrayList<Integer> ray3 = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,-11818,40,30,20,10));
		ArrayList<Integer> ray4 = new ArrayList<Integer>(Arrays.asList(32767));
		ArrayList<Integer> ray5 = new ArrayList<Integer>(Arrays.asList(255,255));
		ArrayList<Integer> ray6 = new ArrayList<Integer>(Arrays.asList(9,10,-88,100,-555,2));
		ArrayList<Integer> ray7 = new ArrayList<Integer>(Arrays.asList(10,10,10,11,456));
		ArrayList<Integer> ray8 = new ArrayList<Integer>(Arrays.asList(-111,1,2,3,9,11,20, 1));
		ArrayList<Integer> ray9 = new ArrayList<Integer>(Arrays.asList(9,8,7,6,5,4,3,2,0,-2,6));
		ArrayList<Integer> ray10 = new ArrayList<Integer>(Arrays.asList(12,15,18,21,23,1000));
		ArrayList<Integer> ray11 = new ArrayList<Integer>(Arrays.asList(250,19,17,15,13,11,10,9,6,3,2,1,0));
		ArrayList<Integer> ray12 = new ArrayList<Integer>(Arrays.asList(9,10,-8,10000,-5000,-3000));
		
		
		System.out.println(ListSumFirst.go(ray1));
		System.out.println(ListSumFirst.go(ray2));
		System.out.println(ListSumFirst.go(ray3));
		System.out.println(ListSumFirst.go(ray4));
		System.out.println(ListSumFirst.go(ray5));
		System.out.println(ListSumFirst.go(ray6));
		System.out.println(ListSumFirst.go(ray7));
		System.out.println(ListSumFirst.go(ray8));
		System.out.println(ListSumFirst.go(ray9));
		System.out.println(ListSumFirst.go(ray10));
		System.out.println(ListSumFirst.go(ray11));
		System.out.println(ListSumFirst.go(ray12));
		
	}
}
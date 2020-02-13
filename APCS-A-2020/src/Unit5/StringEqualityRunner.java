package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		
		StringEquality eq = new StringEquality();

		//hello goodbye
		//one two
		//three four
		//TCEA UIL
		//State Champions
		//ABC ABC
		//ABC CBA
		//Same Same
		
		
		eq.setWords("hello", "goodbye");
		eq.checkEquality();
		System.out.println(eq.toString());
		
		
		eq.setWords("one", "two");
		eq.checkEquality();
		System.out.println(eq.toString());
		
		
		eq.setWords("three", "four");
		eq.checkEquality();
		System.out.println(eq.toString());
		
		
		eq.setWords("TCEA", "UIL");
		eq.checkEquality();
		System.out.println(eq.toString());
		
		
		eq.setWords("State", "Champions");
		eq.checkEquality();
		System.out.println(eq.toString());
		
		
		eq.setWords("ABC", "ABC");
		eq.checkEquality();
		System.out.println(eq.toString());
		
		eq.setWords("ABC", "CBA");
		eq.checkEquality();
		System.out.println(eq.toString());
		
		eq.setWords("Same", "Same");
		eq.checkEquality();
		System.out.println(eq.toString());
		
	}
}
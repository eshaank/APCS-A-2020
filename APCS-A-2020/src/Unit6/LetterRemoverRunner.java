package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//I am Sam I am a
		//ssssssssxssssesssssesss s
		//qwertyqwertyqwerty a
		//abababababa b
		//abaababababa x
		LetterRemover let = new LetterRemover();
		
		let.setRemover("I am Sam I am", 'a');
		let.removeLetters();
		System.out.println(let.toString());
		
		let.setRemover("ssssssssxssssesssssesss", 's');
		let.removeLetters();
		System.out.println(let.toString());
		
		let.setRemover("qwertyqwertyqwerty", 'a');
		let.removeLetters();
		System.out.println(let.toString());
		
		let.setRemover("abababababa", 'b');
		let.removeLetters();
		System.out.println(let.toString());
		
		let.setRemover("abaababababa", 'x');
		let.removeLetters();
		System.out.println(let.toString());

	}
	
}
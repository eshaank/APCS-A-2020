package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		//add test cases	
		
		//Hello
		//World
		//JukeBox
		//TCEA
		//UIL
		
		Word word = new Word();
		
		word.setString("Hello");
		System.out.println(word);
		
		word.setString("World");
		System.out.println(word);
		
		word.setString("JukeBox");
		System.out.println(word);
		
		word.setString("TCEA");
		System.out.println(word);
		
		word.setString("UIL");
		System.out.println(word);
	}
}
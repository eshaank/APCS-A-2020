package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		//add test cases
	   WordsCompare comp = new WordsCompare();
	   
	  //abe ape
	   //giraffe gorilla
	   //one two
	   //fun funny
	   //123 19
	   //193 1910
	   //goofy godfather
	   //funnel fun
	   
	   comp.setWords("abe", "ape");
	   comp.compare();
	   System.out.println(comp.toString());
	   
	   comp.setWords("giraffe", "gorilla");
	   comp.compare();
	   System.out.println(comp.toString());
	   
	   comp.setWords("one", "two");
	   comp.compare();
	   System.out.println(comp.toString());
	   
	   
	   comp.setWords("fun", "funny");
	   comp.compare();
	   System.out.println(comp.toString());
	   
	   comp.setWords("123", "19");
	   comp.compare();
	   System.out.println(comp.toString());
	   
	   comp.setWords("193", "1910");
	   comp.compare();
	   System.out.println(comp.toString());
	   
	   comp.setWords("goofy", "godfather");
	   comp.compare();
	   System.out.println(comp.toString());
	   
	   comp.setWords("funnel", "fun");
	   comp.compare();
	   System.out.println(comp.toString());

	}
}
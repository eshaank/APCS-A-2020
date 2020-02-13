package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String vowels = "AEIOUaeiou";
	   
	   for (int i = 0; i < vowels.length(); i++) {
		   if(a.charAt(0) == vowels.charAt(i)|| a.charAt(a.length() - 1) == vowels.charAt(i)) {
			   return "yes";
		   }
	}
	   
	   
	   
	  
		return "no";
	}
}
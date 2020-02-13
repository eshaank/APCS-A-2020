package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class AvgLen
{
   public static double go( String a, String b )
	{
	   int aLen = a.length();
	   int bLen = b.length();
		return ((double) (aLen) + bLen) / 2;
	}
}
package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class DoubleRunner
{
	public static void main(String[] args)
	{
		BiggestDouble run = new BiggestDouble(4.5,6.7,7.8,9.0);
		
		System.out.println(run);
		
		run.setDoubles(14.51, 6.17, 71.8, 1.0);
		System.out.println(run);
		
		run.setDoubles(41.15, 816.7, 17.8, 19.0);
		System.out.println(run);
		
		run.setDoubles(884.5, 16.7, 7.8, 9.0);
		System.out.println(run);
		
		run.setDoubles(4.5, -456.7, 677.8, 9.0);
		System.out.println(run);
		
		run.setDoubles(4.5, 16.7, -7.8, -9.0);
		System.out.println(run);
		
		//add more test cases
			
//		4.5 6.7 7.8 9.0
//		14.51 6.17 71.8 1.0
//		41.15 816.7 17.8 19.0
//		884.5 16.7 7.8 9.0
//		4.5 -456.7 677.8 9.0
//		4.5 16.7 -7.8 -9.0
	}
}
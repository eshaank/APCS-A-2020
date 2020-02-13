package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		//add test cases
		
		//496
		//45
		//6
		//14
		//8128
		//1245
		//33
		//28
		//27
		//33550336
					
		Perfect p = new Perfect(10);
		
		p.setNumber(496);
		System.out.println(p);
		
		p.setNumber(45);
		System.out.println(p);
		
		p.setNumber(6);
		System.out.println(p);
		
		p.setNumber(14);
		System.out.println(p);
		
		p.setNumber(8128);
		System.out.println(p);
		
		p.setNumber(1245);
		System.out.println(p);
		
		p.setNumber(33);
		System.out.println(p);
		
		p.setNumber(28);
		System.out.println(p);
		
		p.setNumber(27);
		System.out.println(p);
		
		p.setNumber(33550336);
		System.out.println(p);
		
		
	}
}
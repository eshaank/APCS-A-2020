package Unit7;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFiveRunner {
	public static void main(String args[]) {
		TriangleFive test = new TriangleFive();
		
		System.out.println(test);
		
		
		TriangleFive tri = new TriangleFive('C',4);
		out.println(tri);
		tri.setLetter('A');
		tri.setAmount(5);
		out.println(tri);
		tri.setLetter('B');
		tri.setAmount(7);
		out.println(tri);
		tri.setLetter('X');
		tri.setAmount(6);
		out.println(tri);
		tri.setLetter('Z');
		tri.setAmount(8);
		out.println(tri);
	}
}
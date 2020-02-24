package Unit8;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner {
	public static void main(String args[]) {
//		[7,1,5,3,11,5,6,7,8,9,10,12345,11]
//		[11,9,8,7,6,5,4,3,2,1,-99,7]
//		[10,20,30,40,5,41,31,20,11,7]
//		[32767,70,4,5,6,7]
//		[2,7,11,21,5,7]
//		[7,255,11,255,100,3,2]
//		[9,11,11,11,7,1000,3]
//		[7,7,7,11,2,7,7,11,11,2]
//		[2,4,6,8,8]
		int[] r1 = {7,1,5,3,11,5,6,7,8,9,10,12345,11};
		System.out.println(RayOddToEven.go(r1));
		int[] r2 = {11,9,8,7,6,5,4,3,2,1,-99,7};
		System.out.println(RayOddToEven.go(r2));
		int[] r3 = {10,20,30,40,5,41,31,20,11,7};
		System.out.println(RayOddToEven.go(r3));
		int[] r4 = {32767,70,4,5,6,7};
		System.out.println(RayOddToEven.go(r4));
		int[] r5 = {2,7,11,21,5,7};
		System.out.println(RayOddToEven.go(r5));
		int[] r6 = {7,255,11,255,100,3,2};
		System.out.println(RayOddToEven.go(r6));
		int[] r7 = {9,11,11,11,7,1000,3};
		System.out.println(RayOddToEven.go(r7));
		int[] r8 = {7,7,7,11,2,7,7,11,11,2};
		System.out.println(RayOddToEven.go(r8));
		int[] r9 = {2,4,6,8,8};
		System.out.println(RayOddToEven.go(r9));
	}
}
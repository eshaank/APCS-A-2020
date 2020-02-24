package Unit8;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -
//Date -

public class DownRunner {
	public static void main(String args[]) {
//				[-99,1,2,3,4,5,6,7,8,9,10,12345]
//				[10,9,8,7,6,5,4,3,2,1,-99]
//				[10,20,30,40,50,-11818,40,30,20,10]
//				[32767]
//				[255,255]
//				[9,10,-88,100,-555,1000]
//				[10,10,10,11,456]
//				[-111,1,2,3,9,11,20,30]
//				[9,8,7,6,5,4,3,2,0,-2,-989]
//				[12,15,18,21,23,1000]
//				[250,19,17,15,13,11,10,9,6,3,2,1,-455]
//				[9,10,-8,10000,-5000,1000]
		int[] r1 = { -99, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12345 };
		System.out.println(RayDown.go(r1));
		int[] r2 = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, -99 };
		System.out.println(RayDown.go(r2));
		int[] r3 = { 10, 20, 30, 40, 50, -11818, 40, 30, 20, 10 };
		System.out.println(RayDown.go(r3));
		int[] r4 = { 32767 };
		System.out.println(RayDown.go(r4));
		int[] r5 = { 255, 255 };
		System.out.println(RayDown.go(r5));
		int[] r6 = { 9, 10, -88, 100, -555, 1000 };
		System.out.println(RayDown.go(r6));
		int[] r7 = { 10, 10, 10, 11, 456 };
		System.out.println(RayDown.go(r7));
		int[] r8 = { -111, 1, 2, 3, 9, 11, 20, 30 };
		System.out.println(RayDown.go(r8));
		int[] r9 = { 9, 8, 7, 6, 5, 4, 3, 2, 0, -2, -989 };
		System.out.println(RayDown.go(r9));
		int[] r10 = { 12, 15, 18, 21, 23, 1000 };
		System.out.println(RayDown.go(r10));
		int[] r11 = { 250, 19, 17, 15, 13, 11, 10, 9, 6, 3, 2, 1, 0 };
		System.out.println(RayDown.go(r11));
		int[] r12 = { 9, 10, -8, 10000, -5000, 1000 };
		System.out.println(RayDown.go(r12));
	}
}
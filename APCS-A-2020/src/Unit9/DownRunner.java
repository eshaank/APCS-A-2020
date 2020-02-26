package Unit9;

import java.util.ArrayList;
import java.util.Arrays;

//(c) A+ Computer Science

//www.apluscompsci.com
//Name -
//Date -

public class DownRunner {
	public static void main(String args[]) {
		int[] arr1 = { -99, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12345 };
		int[] arr2 = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, -99 };
		int[] arr3 = { 10, 20, 30, 40, 50, -11818, 40, 30, 20, 10 };
		int[] arr4 = { 32767 };
		int[] arr5 = { 255, 255 };
		int[] arr6 = { 9, 10, -88, 100, -555, 1000 };
		int[] arr7 = { 10, 10, 10, 11, 456 };
		int[] arr8 = { -111, 1, 2, 3, 9, 11, 20, 30 };
		int[] arr9 = { 9, 8, 7, 6, 5, 4, 3, 2, 0, -2, -989 };
		int[] arr10 = { 12, 15, 18, 21, 23, 1000 };
		int[] arr11 = { 250, 19, 17, 15, 13, 11, 10, 9, 6, 3, 2, 1, -455 };
		int[] arr12 = { 9, 10, -8, 10000, -5000, 1000 };

		System.out.println(ListDown.go(setList(arr1)));
		System.out.println(ListDown.go(setList(arr2)));
		System.out.println(ListDown.go(setList(arr3)));
		System.out.println(ListDown.go(setList(arr4)));
		System.out.println(ListDown.go(setList(arr5)));
		System.out.println(ListDown.go(setList(arr6)));
		System.out.println(ListDown.go(setList(arr7)));
		System.out.println(ListDown.go(setList(arr8)));
		System.out.println(ListDown.go(setList(arr9)));
		System.out.println(ListDown.go(setList(arr10)));
		System.out.println(ListDown.go(setList(arr11)));
		System.out.println(ListDown.go(setList(arr12)));

	}

	public static ArrayList<Integer> setList(int[] array) {

		ArrayList<Integer> nums = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			nums.add(array[i]);
		}
		return nums;
	}
}
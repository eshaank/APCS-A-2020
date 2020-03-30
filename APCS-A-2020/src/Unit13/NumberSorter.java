package Unit13;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter {
	// instance variables and other methods not shown

	private static int getNumDigits(int number) {
		int count = 0;
		while (number % 10 > 0) {
			count++;
			number /= 10;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number) {
		int[] sorted = new int[getNumDigits(number)];
		for (int i = 0; i < sorted.length; i++) {
			sorted[i] = number % 10;
			number /= 10;
		}
		for (int j = 1; j < sorted.length; j++) {
			int temp = sorted[j];
			int index = j;
			while (index > 0 && temp < sorted[index - 1]) {
				sorted[index] = sorted[index - 1];
				index--;
			}
			sorted[index] = temp;
		}
		return sorted;
	}
}
package Unit13;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo {
	private String[] wordRay;

	public WordSortTwo(String sentence) {
		wordRay = sentence.split(" ");
		// System.out.println(Arrays.toString(wordRay));
	}

	public void sort() {
		Arrays.sort(wordRay);
		// System.out.println(Arrays.toString(wordRay));
	}

	public String toString() {
		String output = "";
		int count = 0;
		for (String w : wordRay) {
			output += w + "\n";
			count++;
		}
		return output + "\n\n";

	}
}
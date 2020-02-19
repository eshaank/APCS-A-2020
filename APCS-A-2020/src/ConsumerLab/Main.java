package ConsumerLab;

import java.io.File;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// test reading from files
		// read in the positive adjectives in postiveAdjectives.txt
		System.out.println(Review.totalSentiment("src/ConsumerLab/simpleReview.txt") + ", " + Review.starRating("src/ConsumerLab/simpleReview.txt"));
		System.out.println(Review.totalSentiment("src/ConsumerLab/26WestReview.txt") + ", " + Review.starRating("src/ConsumerLab/26WestReview.txt"));
		System.out.println(Review.fakeReview("src/ConsumerLab/simpleReview.txt"));

	}
}

//
//  
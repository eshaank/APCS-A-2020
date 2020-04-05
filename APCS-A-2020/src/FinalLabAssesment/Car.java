package FinalLabAssesment;

import java.util.ArrayList;
import java.util.Scanner;

public class Car {
	private ArrayList<Integer> mpg;
	
	public Car() {
		setMPGList("0");
	}
	public Car(String mpgList) {
		setMPGList(mpgList);
	}
	
	public void setMPGList(String mpgList) {
		mpg = new ArrayList<>();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(mpgList);
		while(scan.hasNextInt()) {
			mpg.add(scan.nextInt());
		}
	}
	public int getLowMPG() {
		int lowestMPG = mpg.get(0);
		for (int i = 0; i < mpg.size(); i++) {
			if(lowestMPG > mpg.get(i)) {
				lowestMPG = mpg.get(i);
			}
		}
		return lowestMPG;
	}
	public int getHighestMPG() {
		int highestMPG = mpg.get(0);
		for (int i = 0; i < mpg.size(); i++) {
			if(highestMPG < mpg.get(i)) {
				highestMPG = mpg.get(i);
			}
		}
		return highestMPG;
	}
	
	public double getAvgMPG() {
		int sum = 0;
		for (int i = 0; i < mpg.size(); i++) {
		sum+= mpg.get(i);
		}
		int avg =  sum/mpg.size();
		return avg;
	}
	
	public String toString() {
		String output = "";
		for (int i = 0; i < mpg.size(); i++) {
			output+= mpg.get(i) + ", ";
		}
		return output;
	}
	
}

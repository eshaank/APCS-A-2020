package FinalLabAssesment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrintFileTest {
	public static void main(String[] args) {
		String state = JOptionPane.showInputDialog("Enter a state");
		COVID19 test = new COVID19(state);
		System.out.println(test);
	}

	public static void readFromFile() {
		String date = JOptionPane.showInputDialog(
				"Enter a date between March 14, 2020 and April 1, 2020 to see the COVID-19 stats (Ex. 2020-04-01");
		String csvFile = "/Users/eshaankansagara/Desktop/APCS-A-2020/APCS-A-2020/src/FinalLabAssesment/us-states.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = "	";
		ArrayList<String> cases = new ArrayList<>();

		try {
			System.out.println("COVID-19 Cases by State (" + date + ")");
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {

				String[] data = line.split(cvsSplitBy);
//				if (data[0].equals(date)) {
//					System.out.println("date= " + data[0] + " , state= " + data[1] + " , fips=" + data[2] + " , cases= "
//							+ data[3] + " , deaths= " + data[4]);
//					cases.add(data[3]);
//
//				}

			}
//			ArrayList<Integer> casesList = getIntegerArray(cases);
//			int caseAvg = 0;
//			for (int i = 0; i < casesList.size(); i++) {
//				caseAvg += casesList.get(i);
//			}
//			System.out.println(casesList);
//			System.out.println("The number of cases in " + date + " is: " + caseAvg);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static ArrayList<Integer> getIntegerArray(ArrayList<String> stringArray) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (String stringValue : stringArray) {
			try {
				// Convert String to Integer, and store it into integer array list.
				result.add(Integer.parseInt(stringValue));
			} catch (NumberFormatException nfe) {
				System.out.println("Could not parse " + nfe);
			}
		}
		return result;
	}
}

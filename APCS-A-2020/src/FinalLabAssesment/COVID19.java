package FinalLabAssesment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class COVID19 {
	private ArrayList<String> stateCases;
	private ArrayList<String> stateDeaths;

	public COVID19(String state) {
		setStateCases(state);
	}

	public void setStateCases(String state) {
		stateCases = new ArrayList<>();
		stateDeaths = new ArrayList<>();
		readFromFile(state);
	}

	public ArrayList<Double> getCaseDeathRatio(){
		ArrayList<Double> stateCasesDub = getDoubleArray(stateCases);
		ArrayList<Double> stateDeathsDub = getDoubleArray(stateDeaths);
		ArrayList<Double> caseDeathRatio = new ArrayList<>();
		double ratio = 0.0;
		for (int i = 0; i < stateCasesDub.size(); i++) {
			ratio = stateCasesDub.get(i)/stateDeathsDub.get(i);
			double rounded = Math.round(ratio * 10.0) / 100.0;
			caseDeathRatio.add(rounded);
		}
		//System.out.println(caseDeathRatio);
		return caseDeathRatio;
		
	}
	
	public int getNumDaysRecorded() {
		return stateCases.size();
	}
	
	public String toString() {
		String output = "The number of cases recorded since 2020-03-01 (updated each day)\n\n";
		
		output += "Cases Recorded: " + stateCases + "\nDeaths Recorded: " + stateDeaths;
		return output;
	}
	
	
	
	
	
	
	
	public static ArrayList<Double> getDoubleArray(ArrayList<String> stringArray) {
		ArrayList<Double> result = new ArrayList<>();
		for (String stringValue : stringArray) {
			try {
				// Convert String to Integer, and store it into integer array list.
				result.add((double) Integer.parseInt(stringValue));
			} catch (NumberFormatException nfe) {
				System.out.println("Could not parse " + nfe);
			}
		}
		return result;
	}

	public void readFromFile(String state) {
		String csvFile = "/Users/eshaankansagara/Desktop/APCS-A-2020/APCS-A-2020/src/FinalLabAssesment/us-states.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = "	";

		try {
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {

				String[] data = line.split(cvsSplitBy);
				if (data[1].equals(state)) {
//					System.out.println("date= " + data[0] + " , state= " + data[1] + " , fips=" + data[2] + " , cases= "
//							+ data[3] + " , deaths= " + data[4]);
					stateCases.add(data[3]);
					stateDeaths.add(data[4]);
				}

			}
//			ArrayList<Integer> casesList = getIntegerArray(cases);
//			int caseAvg = 0;
//			for (int i = 0; i < casesList.size(); i++) {
//				caseAvg += casesList.get(i);
//			}
//			System.out.println(stateCases);
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
}

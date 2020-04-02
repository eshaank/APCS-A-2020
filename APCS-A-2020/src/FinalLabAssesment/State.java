package FinalLabAssesment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class State {
	private String stateName;
	private COVID19 numCases;
	private HashMap<String, Integer> getStateCases;
	private ArrayList<String> states;
	
	
	public State() {
		setName("");
		setNumCases();
	}
	
	
	public void setName(String name) {
		stateName = name;
	}
	public void setNumCases() {
		numCases = new COVID19(stateName);
	}
	
	public void getStateCases() {
		getStateCases = new HashMap<>();
		
		getStateCases.keySet();
	}
	public void setStates() {
		states = new ArrayList<>();
		readFromFile();
	}
	
	
	public void readFromFile() {
		String csvFile = "/Users/eshaankansagara/Desktop/APCS-A-2020/APCS-A-2020/src/FinalLabAssesment/us-states.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = "	";

		try {
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {

				String[] data = line.split(cvsSplitBy);
				if (data[1].equals("2020-04-01")) {
//					System.out.println("date= " + data[0] + " , state= " + data[1] + " , fips=" + data[2] + " , cases= "
//							+ data[3] + " , deaths= " + data[4]);
					states.add(data[1]);
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

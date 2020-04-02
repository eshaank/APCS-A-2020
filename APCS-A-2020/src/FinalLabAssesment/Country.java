package FinalLabAssesment;

import java.util.ArrayList;

public class Country {
	private String stateName;
	private ArrayList<State> stateList;
	
	public Country() {
		stateName = "";
		stateList = new ArrayList<State>();
	}
	public Country(String stateName, int stateCount) {
		this.stateName = stateName;
		stateList = new ArrayList<State>();
	}
	
	public void addState(State s, int stateCount) {
		stateList.add(s);
	}
	
	public void sortStates() {
		stateList.stream().sorted();
	}
	
	public int getCountryAverage(){
		int avg = 0; 
		
		return avg;
	}
}

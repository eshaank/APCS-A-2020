package FinalLabAssesment;

import java.util.ArrayList;
import java.util.Collections;

public class Dealership {
	private String name;
	private ArrayList<CarBrand> carList;

	public Dealership() {
		name = "";
		carList = new ArrayList<CarBrand>();
	}

	public Dealership(String name) {
		setName(name);
		carList = new ArrayList<CarBrand>();
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addCars(CarBrand car) {
		carList.add(car);
	}

	public String getName() {
		return name;
	}

	public void getAverageMPG(String name) {
		for (int i = 0; i < carList.size(); i++) {
			if (carList.get(i).equals(name)) {
				carList.get(i).getAverage();
			}
		}
	}

	public CarBrand getCar(String name) {
		for(CarBrand car: carList) {
			if(car.getName().equals(name)) {
				return car;
			}
		}
		return null;
	}
	public String getCarLowestAvgMPG() {
		return carList.get(carList.size() - 1).getName();
	}
	public String getCarHighestAvgMPG() {
		return carList.get(0).getName();
	}
	
	public String toString() {
		String output = this.name + "\n";
		for (CarBrand car : carList) {
			output += car.toString() + "\n";
		}
		output += "The highest average mpg 2020 car at CarMax is: " + getCarHighestAvgMPG()+"\n";
		output += "The lowest average mpg 2020 car at CarMax is: " + getCarLowestAvgMPG();
		return output;
	}
}
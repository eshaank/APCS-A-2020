package FinalLabAssesment;

public class CarBrand {
	private String name;
	private Car carMPG;

	public CarBrand() {
		setName("0");
		setMPG("0");
	}

	public CarBrand(String name, String gradeList) {
		setName(name);
		setMPG(gradeList);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMPG(String mpgList) {
		carMPG = new Car(mpgList);
	}

	public String getName() {
		return name;
	}

	public double getAverage() {
		return carMPG.getAvgMPG();
	}

	public double getHighGrade() {
		return carMPG.getAvgMPG();
	}

	public double getLowGrade() {
		return carMPG.getLowMPG();
	}

	public String toString() {
		return "Car Brand: " + name + " \nCollected MPG: " + carMPG.toString() + "\nAverage MPG: " + getAverage() + "\n";
	}
}
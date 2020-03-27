package DataLab;

public class SATData2010 {
	private String dbn;
	private String schoolName;
	private int numStudents;
	private int readMean;
	private int mathMean;
	private int writeMean;

	SATData2010(String d, String name, int num, int reading, int math, int writing) {
	      dbn = d;
	      schoolName = name;
	      numStudents = num;
	      readMean = reading;
	      mathMean = math;
	      writeMean = writing;
	   }

	
	public String getDBN() {
		return dbn;
	}

	
	public String getSchoolName() {
		return schoolName;
	}

	public int getReadMean() {
		return readMean;
	}

	public int getWriteMean() {
		return writeMean;
	}

	public int getMathMean() {
		return mathMean;
	}
	public int getAvgTotalScore() {
		return getReadMean() + getWriteMean() + getMathMean();
	}
}

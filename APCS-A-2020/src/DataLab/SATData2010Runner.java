package DataLab;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import core.data.DataSource;

public class SATData2010Runner {
	
	public static void main(String[] args) {
		SATData2010 newSchool = new SATData2010(null, null, 0, 0, 0, 0);
		int totalAvgScore = 0;
		DataSource ds = DataSource.connect("https://data.cityofnewyork.us/api/views/zt9s-n5aj/rows.xml").load();
		
		ArrayList<SATData2010> schools = ds.fetchList(SATData2010.class, "row/row/dbn", "row/row/school_name",
				"row/row/number_of_test_takers", "row/row/critical_reading_mean", "row/row/mathematics_mean",
				"row/row/writing_mean");
		System.out.println("Total schools: " + schools.size());

	
		for (SATData2010 schl : schools) {
			if (schl.getAvgTotalScore() > totalAvgScore) {
				totalAvgScore = schl.getAvgTotalScore();
				newSchool = schl;
			}
		}
		JOptionPane.showMessageDialog(null, "The school with the greatest overall average was: "
				 + newSchool.getSchoolName() + " with a score of: " + totalAvgScore);
	}
}

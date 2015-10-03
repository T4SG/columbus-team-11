package codeforgood.model;

public class Academics {

	private int points=0;
	private int Test;
	private int ACT;
	private int SAT;
	public double GPA;
	public String Awards;
	public String Scholarships;
	
	public int getAcademicPoints(){
		return points;
	}
	
	public void setAcademicPoints(int points){
		this.points=points;
	}

	public int getTest() {
		return Test;
	}

	public void setTest(int test) {
		Test = test;
		points=points+10;
	}

	public int getACT() {
		return ACT;
	}

	public void setACT(int aCT) {
		ACT = aCT;
		points=points+10;
	}

	public int getSAT() {
		return SAT;
	}

	public void setSAT(int SAT) {
		SAT = SAT;
		points=points+10;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
		points=points+10;
	}

	public String getAwards() {
		return Awards;
	}

	public void setAwards(String awards) {
		Awards = awards;
		points=points+10;
	}

	public String getScholarships() {
		return Scholarships;
	}

	public void setScholarships(String scholarships) {
		Scholarships = scholarships;
		points=points+10;
	}
	
}

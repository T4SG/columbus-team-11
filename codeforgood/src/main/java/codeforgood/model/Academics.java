package codeforgood.model;

public class Academics {

	private int points=0;
	public String Awards;
	public String Scholarships;


	public int getAcademicPoints(){
		return points;
	}

	public void setAcademicPoints(){
		points=points+100;

	}

	public String getAwards() {
		return Awards;
	}

	public void setAwards(String awards) {
		Awards = awards;
		points=points+100;
	}

	public String getScholarships() {
		return Scholarships;
	}

	public void setScholarships(String scholarships) {
		Scholarships = scholarships;
		points=points+100;
	}

}

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
	
	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getTest() {
		return Test;
	}

	public void setTest(int test) {
		Test = test;
	}

	public int getACT() {
		return ACT;
	}

	public void setACT(int aCT) {
		ACT = aCT;
	}

	public int getSAT() {
		return SAT;
	}

	public void setSAT(int sAT) {
		SAT = sAT;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public String getAwards() {
		return Awards;
	}

	public void setAwards(String awards) {
		Awards = awards;
	}

	public String getScholarships() {
		return Scholarships;
	}

	public void setScholarships(String scholarships) {
		Scholarships = scholarships;
	}

	public int setAcademicPoints(int newPoints){
		points=newPoints;
		return points;
	}
	
	public void Test(){
		points=points+10;
	}
	
	public void ACT(){
		points=points+10;
	}
	
	public void SAT(){
		points=points+10;
	}
	
	public void GPA(){
		points=points+10;
	}
	
	public void Awards(){
		points=points+100;
	}
	
	public void Scholarship(){
		points=points+100;
	}
	
}

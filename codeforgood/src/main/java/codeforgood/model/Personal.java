package codeforgood.model;

public class Personal {

    private int points = 0;
    private int Test;
    private int ACT;
    private int SAT;
    public double GPA;
    public String Awards;
    public String Scholarships;
	private static int k=-1;

    public int getPersonalPoints() {
        return this.points;
    }

    public void setPersonalPoints(int points) {
        this.points = points;
    }

    public int getTest() {
        return this.Test;
    }

    public void setTest(int test) {
        this.Test = test;
        this.points = this.points + 10;
    }

    public int getACT() {
        return this.ACT;
    }

    public void setACT(int aCT) {
        this.ACT = aCT;
        this.points = this.points + 10;
    }

    public int getSAT() {
        return this.SAT;
    }

    public void setSAT(int SAT) {
        SAT = SAT;
        this.points = this.points + 10;
    }

    public double getGPA() {
        return this.GPA;
    }

    public void setGPA(double gPA) {
        this.GPA = gPA;
        this.points = this.points + 10;
    }

    public String getAwards() {
        return this.Awards;
    }

    public void setAwards(String awards) {
        this.Awards = awards;
        this.points = this.points + 10;
    }

    public String getScholarships() {
        return this.Scholarships;
    }

    public void setScholarships(String scholarships) {
        this.Scholarships = scholarships;
        this.points = this.points + 10;
    }

}

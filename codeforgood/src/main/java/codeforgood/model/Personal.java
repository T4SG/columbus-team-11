package codeforgood.model;

public class Personal {

    private int points = 0;
    private int Test;
    private int ACT;
    private int SAT;
    public double GPA;
    public String Awards;
    public String Scholarships;

    public int getPersonalPoints() {
        return this.points;
    }

    public int getPoints() {
        return this.points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getTest() {
        return this.Test;
    }

    public void setTest(int test) {
        this.Test = test;
    }

    public int getACT() {
        return this.ACT;
    }

    public void setACT(int aCT) {
        this.ACT = aCT;
    }

    public int getSAT() {
        return this.SAT;
    }

    public void setSAT(int sAT) {
        this.SAT = sAT;
    }

    public double getGPA() {
        return this.GPA;
    }

    public void setGPA(double gPA) {
        this.GPA = gPA;
    }

    public String getAwards() {
        return this.Awards;
    }

    public void setAwards(String awards) {
        this.Awards = awards;
    }

    public String getScholarships() {
        return this.Scholarships;
    }

    public void setScholarships(String scholarships) {
        this.Scholarships = scholarships;
    }

    public int setAcademicPoints(int newPoints) {
        this.points = newPoints;
        return this.points;
    }

    public void Test() {
        this.points = this.points + 10;
    }

    public void ACT() {
        this.points = this.points + 10;
    }

    public void SAT() {
        this.points = this.points + 10;
    }

    public void GPA() {
        this.points = this.points + 10;
    }

    public void Awards() {
        this.points = this.points + 100;
    }

    public void Scholarship() {
        this.points = this.points + 100;
    }

}

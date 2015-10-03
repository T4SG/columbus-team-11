package codeforgood.model;

public class Personal {

    private int points = 0;
    private String healthyDiet;
    private String movePlaces;
    private String sportAcievements;
   
    public int getAcademicPoints() {
        return this.points;
    }


    public void setAcademicPoints(int points) {
        this.points = points;
    }

	public String getHealthyDiet() {
		return healthyDiet;
	}

	public void setHealthyDiet(String healthyDiet) {
		this.healthyDiet = healthyDiet;
		points=points+10;
	}

	public String getMovePlaces() {
		return movePlaces;
	}

	public void setMovePlaces(String movePlaces) {
		this.movePlaces = movePlaces;
		points=points+10;
	}

	public String getSportAcievements() {
		return sportAcievements;
	}

	public void setSportAcievements(String sportAcievements) {
		this.sportAcievements = sportAcievements;
		points=points+10;
	}

   

}

package codeforgood.model;

public class Community {

	private String volunteering; 
	private String Events;
	private String Mentoring;
	private int points=0;
	
	public String getVolunteering() {
		return volunteering;
	}
	public void setVolunteering(String volunteering) {
		this.volunteering = volunteering;
		points=points+10;
	}
	public String getEvents() {
		return Events;
	}
	public void setEvents(String events) {
		Events = events;
		points=points+10;
	}
	public String getMentoring() {
		return Mentoring;
	}
	public void setMentoring(String mentoring) {
		Mentoring = mentoring;
		points=points+10;
	}
	
	public int getAcademicPoints(){
		return points;
	}
	
	public void setAcademicPoints(int points){
		this.points=points;
	}

	
}

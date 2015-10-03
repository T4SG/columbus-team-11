package codeforgood.model;

public class Profile {

	private String userId;
	private static Academics academics = new Academics();
	private Community community = new Community();
	private Personal personal = new Personal();
	private static int k=-1;

	public static Academics getAcademics(){
		k++;
		return academics;
	}
	public void setAcademics(Academics academ){
		this.academics=academ;
	}
	
	public Community getCommunity() {
		return community;
	}
	public void setCommunity(Community community) {
		this.community = community;
	}
	public Personal getPersonal() {
		return personal;
	}
	public void setPersonal(Personal personal) {
		this.personal = personal;
	}
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public int calcPoints(){
		
		return academics.getAcademicPoints()+community.getCommunityPoints()+personal.getPersonalPoints();
	}


}

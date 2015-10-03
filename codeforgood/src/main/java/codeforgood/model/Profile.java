package codeforgood.model;

public class Profile {

	private String userId;
	private Academics academ = new Academics();
	private Community community = new Community();
	private Personal personal = new Personal();

	public Academics getAcadem(){
		return academ;
	}
	public void setAcademics(Academics academ){
		this.academ=academ;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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


}

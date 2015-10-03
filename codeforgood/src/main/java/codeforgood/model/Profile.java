package codeforgood.model;

public class Profile {

	private String userId;
	private Academics academ = new Academics();

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


}

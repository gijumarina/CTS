package ro.ase.acs.cts.facade;

public class Login {
	String username;
	String pass;
	public Login(String username, String pass) {
		super();
		this.username = username;
		this.pass = pass;
	}
	
	public void login() {
		
	}
	
	public UserProfile getUserProfile() {
		return new UserProfile();
	}
}

package ro.ase.acs.cts.facade;

public class UserAPIFacade {

	//the facade method
	public static String getUserProfile(String user, String pass) {
		
		GameServer gameServer = new GameServer();
		gameServer.connect();
		
		Login login = new Login("player1", "1234");
		login.login();
		
		UserProfile userProfile = login.getUserProfile();
		String profile = userProfile.getProfile();
		
		return profile;
	}
}

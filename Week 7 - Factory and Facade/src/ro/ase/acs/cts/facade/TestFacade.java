package ro.ase.acs.cts.facade;

public class TestFacade {
	
	public static void main(String[] args) {
		
		//1.Create a game server instance and connect
		GameServer gameServer = new GameServer();
		gameServer.connect();
		
		//Create a login
		Login login = new Login("player1", "1234");
		login.login();
		
		UserProfile userProfile = login.getUserProfile();
		String profile = userProfile.getProfile();
		
		//using the facade
		String profile2 = UserAPIFacade.getUserProfile("player 2", "123456");
	}
	
}

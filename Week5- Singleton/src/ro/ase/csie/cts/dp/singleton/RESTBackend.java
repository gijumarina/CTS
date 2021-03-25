package ro.ase.csie.cts.dp.singleton;

public class RESTBackend {
	String url;
	String data;
	
	//eager-instantiation
	//private static RESTBackend theBackend = new RESTBackend();
	
	private static RESTBackend theBackend = null;
	
	//don't forget to make all the constructors private!!!!
	private RESTBackend(String url, String data) {
		System.out.println("Opening a connection to the backend service");
		this.url = url;
		this.data = data;
	}
	
	private RESTBackend() {
		
	}
	
	public void sendGET() {
		System.out.println("Send GET command to " + this.url);
	}
	
	public static synchronized RESTBackend getRESTBackend() {
		if(theBackend == null) {
			//get the back-end data from a config/settings file
			String url = "www.acs.ase.ro/game";
			String data = "get backend connection";
			theBackend = new RESTBackend(url, data);
		}
		
		return theBackend;
	}
	
	//lazy-instantiation example
//	public static synchronized RESTBackend getRESTBackend(String url, String data) {
//		if(theBackend == null) {
//			//get the back-end data from a config/settings file
//			theBackend = new RESTBackend(url, data);
//		}
//		
//		return theBackend;
//	}
}

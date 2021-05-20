package ro.ase.csie.cts.dp.observer;

public class TestObserver {

	public static void main(String[] args) {
		
		ServerConnectionModule connection = new ServerConnectionModule();
		
		ConnectionStatusInterface backUp = new BackUpModule();
		ConnectionStatusInterface notifications = new UserNotificationsModule();
		
		connection.detectConnectionStatusChange(ConnectionStatus.UP);
		
		connection.register(notifications);
		connection.register(backUp);
		
		connection.detectConnectionStatusChange(ConnectionStatus.DOWN);
		
		connection.unregister(backUp);
		
		connection.detectConnectionStatusChange(ConnectionStatus.UP);
		
	}

}

package ro.ase.csie.cts.dp.proxy;

public interface LoginInterface {
	
	public boolean login(String username, String pass);
	public boolean checkServerStatus();
	
}

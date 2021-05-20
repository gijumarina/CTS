package ro.ase.csie.cts.dp.observer;

public class BackUpModule implements ConnectionStatusInterface {

	@Override
	public void connectionUp() {
		System.out.println("Display restore points");
	}

	@Override
	public void connectionDown() {
		System.out.println("Create a restore point");
	}
	
}

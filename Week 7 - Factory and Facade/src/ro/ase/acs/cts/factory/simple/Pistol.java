package ro.ase.acs.cts.factory.simple;

public class Pistol extends AbstractWeapon{

	public Pistol(String color, int power, int distance) {
		super(color, power);
	}

	@Override
	public void pewPew() {
		System.out.println("---- ---- ->");
	}

}

package ro.ase.acs.cts.factory.simple;

public class TestFactory {

	public static void main(String[] args) {
		
//		AbstractWeapon pistol = new Pistol("black", 100);
//		AbstractWeapon machineGun = new MachineGun("red");
//		AbstractWeapon bazooka = new Bazooka("green", 1000, 500);
		
		
		AbstractWeapon weapon = 
				WeaponFactory.getWeapon(WeaponType.PISTOL, "black");
		weapon = WeaponFactory.getWeapon(WeaponType.MACHINE_GUN, "red");
		weapon = WeaponFactory.getWeapon(WeaponType.BAZOOKA, "green");
	}

}

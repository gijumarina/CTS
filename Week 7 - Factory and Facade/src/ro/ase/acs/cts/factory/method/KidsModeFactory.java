package ro.ase.acs.cts.factory.method;

import ro.ase.acs.cts.factory.simple.AbstractWeapon;
import ro.ase.acs.cts.factory.simple.Bazooka;
import ro.ase.acs.cts.factory.simple.MachineGun;
import ro.ase.acs.cts.factory.simple.Pistol;
import ro.ase.acs.cts.factory.simple.WeaponType;

public class KidsModeFactory extends AbstractWeaponFactory {

	@Override
	public AbstractWeapon getWeapon(WeaponType type, String color) {
		AbstractWeapon weapon = null;
		switch (type) {
		case PISTOL:
			weapon = new WaterPistol(color, 200);
			break;
		case MACHINE_GUN:
			weapon = new WaterBallon(color, 500);
			break;
		case BAZOOKA:
			weapon = new WaterBucket(color, 1000);
			break;
		default: 
			throw new UnsupportedOperationException();
		}
		
		return weapon;
	}
	
}

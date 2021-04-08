package ro.ase.acs.cts.factory.method;

import ro.ase.acs.cts.factory.simple.AbstractWeapon;
import ro.ase.acs.cts.factory.simple.Bazooka;
import ro.ase.acs.cts.factory.simple.MachineGun;
import ro.ase.acs.cts.factory.simple.Pistol;
import ro.ase.acs.cts.factory.simple.WeaponType;

public class RealModeFactory extends AbstractWeaponFactory {

	@Override
	public AbstractWeapon getWeapon(WeaponType type, String color) {
		AbstractWeapon weapon = null;
		switch (type) {
		case PISTOL:
			weapon = new Pistol(color, 100, 50);
			break;
		case MACHINE_GUN:
			weapon = new MachineGun(color);
			break;
		case BAZOOKA:
			weapon = new Bazooka(color, 1000, 500);
			break;
		default: 
			throw new UnsupportedOperationException();
		}
		
		return weapon;
	}

}

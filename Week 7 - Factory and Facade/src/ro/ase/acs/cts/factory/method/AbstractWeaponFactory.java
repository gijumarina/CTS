package ro.ase.acs.cts.factory.method;

import ro.ase.acs.cts.factory.simple.AbstractWeapon;
import ro.ase.acs.cts.factory.simple.WeaponType;

public abstract class AbstractWeaponFactory {
	
	public abstract AbstractWeapon getWeapon(WeaponType type, String color);
}

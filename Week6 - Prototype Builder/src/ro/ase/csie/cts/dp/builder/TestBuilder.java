package ro.ase.csie.cts.dp.builder;

public class TestBuilder {

	public static void main(String[] args) {
		
		//1.create the object
		SuperHero superHero = new SuperHero();
		//2.init it
		//TO DO: don't forget
		
		SuperHero superHero2 = 
				new SuperHero("Superman",
						100, false, false, 
						new Weapon(), null, new Flying(), null);
		
	}

}

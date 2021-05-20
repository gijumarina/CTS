package ro.ase.csie.cts.dp.memento;

public class TestMemento {

	public static void main(String[] args) {
		
		SuperHero superman = new SuperHero("Superman", 100, "Fly");
	
		HeroMemento intialSave = superman.createRestorePoint();
		
		superman.takesAHit(50);
		superman.takesAHit(20);
		
		System.out.println("Life points: " + superman.lifePoints);
		
		superman.restore(intialSave);
		
		System.out.println("Life points: " + superman.lifePoints);
		
	}

}

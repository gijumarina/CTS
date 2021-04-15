package ro.ase.csie.cts.dp.decorator;

import ro.ase.csie.cts.dp.adapter.ACMECharacter;

public abstract class ACMEAbstractDecorator extends ACMECharacter {
	
	ACMECharacter character = null;
	
	public ACMEAbstractDecorator(ACMECharacter hero) {
		super(hero.getName(), hero.getLifePoints());
		this.character = hero;
	}

	@Override
	public void move() {
		this.character.move();
	}

	@Override
	public void takeAHit(int points) {
		this.character.takeAHit(points);
	}

	@Override
	public void heal(int points) {
		this.character.heal(points);
	}

	@Override
	public int getLifePoints() {
		return this.character.getLifePoints();
	}
	
	

}

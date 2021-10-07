package dicegame;

import java.util.Random;

public abstract class Dice {
	
	private int nbFaces;
	private int topValue;
	
	public Dice(int nbFaces) {
		super();
		this.nbFaces = nbFaces;
		roll();
	}

	public void roll() {
		topValue = new Random().nextInt(getNbFaces() + 1);
	}

	public int getTopValue() {
		return topValue;
	}

	public int getNbFaces() {
		return nbFaces;
	}
}

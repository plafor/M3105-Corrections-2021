package dicegame.business;

import java.util.Random;

public abstract class Dice {
	
	private int numFaces;
	private int topValue;
	
	private static Random random = new Random();

	public Dice(int numFaces) {
		super();
		this.numFaces = numFaces;
		roll();
	}

	public int getNumFaces() {
		return numFaces;
	}
	
	public int getTopValue() {
		return topValue;
	}
	
	public void roll() {
		topValue = random.nextInt(numFaces) + 1;
	}

}

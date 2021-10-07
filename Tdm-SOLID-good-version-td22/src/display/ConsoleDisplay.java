package display;

import dicegame.IDisplay;

public class ConsoleDisplay implements IDisplay {

	@Override
	public void displayEntryText(int nbFaces) {
		System.out.println("Guess the dice value on next roll (from 1 to "
				+ nbFaces
				+") : ");
	}

	@Override
	public void displayPlayAgainText() {
		System.out.println("play again ?");
	}

	@Override
	public void displaySuccessText() {
		System.out.println("Well done!");
	}
	
	@Override
	public void displayDiceValue(int diceRollValue) {
		System.out.println("Dice roll..");
		System.out.println("The value is " + diceRollValue);
	}
}

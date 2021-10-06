package dicegame.display;

import dicegame.business.IDisplay;

public class Display implements IDisplay {

	@Override
	public void displayDiceValue(int diceRollValue) {
		System.out.println("Dice roll..");
		System.out.println("The value is " + diceRollValue);
	}
	
	@Override
	public void displayEntryText(int maxValue) {
		System.out.println("Guess the dice value on next roll (from 1 to "
				+ maxValue
				+ "): ");
	}

	@Override
	public void displayPlayAgainText() {
		System.out.println("play again ?");
	}

	@Override
	public void displaySuccessText() {
		System.out.println("Well done!");
	}
}

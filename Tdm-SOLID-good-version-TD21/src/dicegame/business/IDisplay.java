package dicegame.business;

public interface IDisplay {

	void displayDiceValue(int diceRollValue);

	void displayEntryText(int maxValue);

	void displayPlayAgainText();

	void displaySuccessText();

}
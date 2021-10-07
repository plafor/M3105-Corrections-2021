package dicegame;

public interface IDisplay {

	void displayEntryText(int nbFaces);

	void displayPlayAgainText();

	void displaySuccessText();

	void displayDiceValue(int diceRollValue);

}
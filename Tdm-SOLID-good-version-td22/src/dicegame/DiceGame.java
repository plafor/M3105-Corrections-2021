package dicegame;

public class DiceGame implements IDiceGame{

	private Dice dice;
	private IInput input;
	private IDisplay display;
	
	public DiceGame(IInput input, IDisplay display, Dice dice) {
		super();
		this.dice = dice;
		this.input = input;
		this.display = display;
	}

	@Override
	public void start() {
		do {
			playOneRound();
		} while (input.readChar() == 'y');
	}

	public void playOneRound() {
		display.displayEntryText(dice.getNbFaces());
		
		int userChoice =input.readInt();
		
		dice.roll();
		int diceRollValue = getRandomDiceValue();
		
		display.displayDiceValue(diceRollValue);
		
		if (userChoice == diceRollValue) {
			display.displaySuccessText();
		}
				
		display.displayPlayAgainText();
	}

	public int getRandomDiceValue() {
		return dice.getTopValue();
	}



}

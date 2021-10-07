import dicegame.Dice;
import dicegame.DiceGame;
import dicegame.DiceWith8Faces;
import dicegame.IDiceGame;
import dicegame.IDisplay;
import dicegame.IInput;
import display.ConsoleDisplay;
import input.KeyboardInput;

public class DiceGameLauncher {

	public static void main(String[] args) {
		
		Dice aDice = new DiceWith8Faces();
		IInput anInput = new KeyboardInput();
		IDisplay aDisplay = new ConsoleDisplay();
		
		IDiceGame game = new DiceGame(anInput, aDisplay, aDice); 
		
		game.start();
	}

}

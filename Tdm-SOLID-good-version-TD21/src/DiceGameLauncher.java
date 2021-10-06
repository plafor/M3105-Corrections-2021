import dicegame.business.Dice;
import dicegame.business.DiceGame;
import dicegame.business.DiceWith8Faces;
import dicegame.business.IDiceGame;
import dicegame.business.IDisplay;
import dicegame.business.Input;
import dicegame.display.Display;
import dicegame.input.KeyboardInput;

public class DiceGameLauncher {

	public static void main(String[] args) {
		Dice aDiceWith8Faces = new DiceWith8Faces();
		Input aKeyboardInput = new KeyboardInput();
		IDisplay aDisplay = new Display();
		
		IDiceGame game = new DiceGame(aKeyboardInput, aDisplay, aDiceWith8Faces);
		
		game.start();
	}

}

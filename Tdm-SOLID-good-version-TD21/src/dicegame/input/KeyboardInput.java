package dicegame.input;

import java.util.Scanner;

import dicegame.business.Input;

public class KeyboardInput implements Input {

	private Scanner reader = new Scanner(System.in);
	
	@Override
	public char readChar() {
		return reader.next().charAt(0);
	}

	@Override
	public int readInt() {
		return reader.nextInt();
	}

}

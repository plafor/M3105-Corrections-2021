package input;

import java.util.Scanner;

import dicegame.IInput;

public class KeyboardInput implements IInput {

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

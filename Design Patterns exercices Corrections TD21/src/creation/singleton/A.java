package creation.singleton;

public class A {
	
	private static A instanceUnique;

	public static A getInstanceUnique() {
		if (instanceUnique == null) {
			instanceUnique = new A();
		}
		return instanceUnique;
	}
	
	private A() {
	}

	public void methode() {
		// code
	}
	
	
}

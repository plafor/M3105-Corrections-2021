package creation.singleton;

public class A {
	
	private static A instance;

	private A() {
	}

	public void methode() {
		// code
		System.out.println("OK");
	}
	
	public static A getInstance() {
		if (instance == null) {
			instance = new A();
		}
		return instance;
	}
	
}

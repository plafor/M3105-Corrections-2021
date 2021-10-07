package creation.singleton;

public class TestA {
	
	public TestA() {
	}
	
	public void trucAFaire() {
		A.getInstanceUnique().methode();
	}
	
	public static void main(String[] args) {
		new TestA();
	}
	
	
}

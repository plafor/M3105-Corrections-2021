package creation.singleton;

public class TestA {

	
	public void methodeUtilisantA() {
		A.getInstance().methode();
	}
	
	public static void main(String[] args) {

		TestA testA = new TestA();
		testA.methodeUtilisantA();
	}
}

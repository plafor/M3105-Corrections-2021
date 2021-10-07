package creation.fabrique;

public interface Student {

	public void giveOOskill();
}

class SmartStudent implements Student {

	public void giveOOskill() {
		System.out.println("Smart level");
	}
}

class DumbStudent implements Student  {
	
	public void giveOOskill() {
		System.out.println("Dumb level");
	}
}
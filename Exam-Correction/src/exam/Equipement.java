package exam;

public abstract class Equipement {

	private String nom;

	//Constructor
	public Equipement(String nom) {
		super();
		this.nom = nom;
	}

	//Getters & Setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	//Methods
	public abstract int getValeur();

	public abstract void recevoirValeurSupp(int nouvelleValeur);

	@Override
	public String toString() {
		return nom;
	}

}

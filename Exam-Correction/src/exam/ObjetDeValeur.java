package exam;

public class ObjetDeValeur extends Equipement {
	
	private int valeur;

	public ObjetDeValeur(String nom, int valeur) {
		super(nom);
		this.valeur = valeur;
	}

	public ObjetDeValeur(String nom) {
		this(nom, 0);
	}

	@Override
	public int getValeur() {
		return valeur;
	}

	@Override
	public void recevoirValeurSupp(int nouvelleValeur) {
		valeur += nouvelleValeur;
	}
	
	

}

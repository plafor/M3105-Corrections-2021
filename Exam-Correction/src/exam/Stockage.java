package exam;

import java.util.ArrayList;
import java.util.List;

public class Stockage extends Equipement {

	private List<Equipement> equipements;

	public Stockage(String nom) {
		super(nom);
		equipements = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "[" + super.toString() + "]";
	}

	public void ajouterEquipement(Equipement nouvelEquipement) {
		equipements.add(nouvelEquipement);
	}

	public void affiche() {
		System.out.println("Le " + getNom() + " contient :");
		
		for (Equipement equipement: equipements) {
			System.out.println(" - " + equipement);
		}
	}

	public void afficheValeur() {
		System.out.println("Le " 
				+ getNom() 
				+ " contient des équipements pour un total de valeur de : "
				+ getValeur());
		
	}

	public void afficheObjetsDeValeurMin(int seuilMin) {
		System.out.println("Objets du "
				+ getNom()
				+ " ayant au moins une valeur égale à "
				+ seuilMin
				+ " : ");
		for (Equipement equipement: equipements) {
			if (equipement instanceof ObjetDeValeur) {
				if (equipement.getValeur() >= seuilMin) {
					System.out.println(" - " 
							+ equipement.getNom()
							+ " (valeur "
							+ equipement.getValeur()
							+ ")");
				}
			}
		}
	}

	@Override
	public int getValeur() {
		int total = 0;
		for (Equipement equipement: equipements) {
			total += equipement.getValeur();
		}
		return total;
	}

	@Override
	public void recevoirValeurSupp(int nouvelleValeur) {
		for (Equipement equipement: equipements) {
			equipement.recevoirValeurSupp(nouvelleValeur);
		}
		
	}
	
	
	
	
	
}

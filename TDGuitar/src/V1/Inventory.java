package V1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<>();
	}

	public void addGuitar(String serialNumber, double price, String builder, String model, String type, String backWood,
			String topWood) {

		guitars.add(new Guitar(serialNumber, price, builder, model, type, backWood, topWood));
	}

	public Guitar getGuitar(String serialNumber) {
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = i.next();
			if (guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}

	public Guitar search(Guitar searchGuitar) {
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = i.next();
			
			if (noMatch(searchGuitar.getBuilder(), guitar.getBuilder())) {
				continue;
			}
			if (noMatch(searchGuitar.getModel(), guitar.getModel())) {
				continue;
			}
			if (noMatch(searchGuitar.getType(), guitar.getType())) {
				continue;
			}
			if (noMatch(searchGuitar.getBackWood(), guitar.getBackWood())) {
				continue;
			}
			if (noMatch(searchGuitar.getTopWood(), guitar.getTopWood())) {
				continue;
			}
	
			return guitar;
		}
		return null;
	}

	private boolean noMatch(String searchedProp, String realProp) {
		if (searchedProp == null)
			return false;
		if (searchedProp.equals(""))
			return false;
		if (searchedProp.equals(realProp))
			return false;
		
		return true;
	}

}

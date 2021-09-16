package V2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<>();
	}

	public void addGuitar(String serialNumber, double price, 
			Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {

		guitars.add(new Guitar(serialNumber, price, builder, model, type, backWood, topWood));
	}

	public List<Guitar> search(Guitar searchGuitar) {
		List<Guitar> matchingGuitars = new ArrayList<>();
		
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
	
			matchingGuitars.add(guitar);
		}
		return matchingGuitars;
	}

	private boolean noMatch(Enum searchedProp, Enum realProp) {
		if (searchedProp == null)
			return false;
		if (searchedProp.equals(realProp))
			return false;
		
		return true;
	}
	
	private boolean noMatch(String searchedProp, String realProp) {
		if (searchedProp == null)
			return false;
		if (searchedProp.equals(""))
			return false;
		if (searchedProp.equalsIgnoreCase(realProp))
			return false;
		
		return true;
	}

}

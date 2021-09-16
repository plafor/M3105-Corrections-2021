package version4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<>();
	}

	public void addGuitar(String serialNumber, double price, GuitarSpec spec) {

		guitars.add(new Guitar(serialNumber, price, spec));
	}

	public List<Guitar> search(GuitarSpec searchGuitar) {
		List<Guitar> matchingGuitars = new ArrayList<>();
		
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = i.next();
			
			if(guitar.getSpec().matches(searchGuitar)) {
				matchingGuitars.add(guitar);
			}
			
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

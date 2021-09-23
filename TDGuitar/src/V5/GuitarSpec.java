package V5;

public class GuitarSpec extends InstrumentSpec {

	public static final int NO_PREF_NUM_STRINGS = -1;
	private int numStrings;

	public GuitarSpec(Builder builder, String model, int numStrings, Type type, Wood backWood, Wood topWood) {
		super(builder, model, type, backWood, topWood);
		this.numStrings = numStrings;
	}

	public int getNumStrings() {
		return numStrings;
	}
	
	@Override
	public boolean matches(InstrumentSpec searchedSpec) {
		if (!(searchedSpec instanceof GuitarSpec)) {
			return false;
		}
		
		GuitarSpec searchedGuitarSpec = (GuitarSpec)searchedSpec;
		
		if (searchedGuitarSpec.getNumStrings() != NO_PREF_NUM_STRINGS && searchedGuitarSpec.getNumStrings() != getNumStrings()) {
			return false;
		}
		return super.matches(searchedSpec);
		
	}

}

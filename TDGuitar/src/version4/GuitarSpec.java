package version4;

public class GuitarSpec {

	public static final int NO_PREF_NUM_STRINGS = -1;
	
	private Builder builder;
	private String model;
	private Type type;
	private int numStrings;
	private Wood backWood;
	private Wood topWood;

	public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.numStrings = numStrings;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public int getNumStrings() {
		return numStrings;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public boolean matches(GuitarSpec searchGuitar) {
		if (searchGuitar.getBuilder() != null && !searchGuitar.getBuilder().equals(getBuilder())) {
			return false;
		}
		if (searchGuitar.getModel() != null 
				&& !searchGuitar.getModel().equals("")
				&& !searchGuitar.getModel().equalsIgnoreCase(getModel())) {
			return false;
		}
		if (searchGuitar.getType() != null && !searchGuitar.getType().equals(getType())) {
			return false;
		}
		if (searchGuitar.getNumStrings() != NO_PREF_NUM_STRINGS && searchGuitar.getNumStrings() != getNumStrings()) {
			return false;
		}
		if (searchGuitar.getBackWood() != null && !searchGuitar.getBackWood().equals(getBackWood())) {
			return false;
		}
		if (searchGuitar.getTopWood() != null && !searchGuitar.getTopWood().equals(getTopWood())) {
			return false;
		}

		return true;
	}

}

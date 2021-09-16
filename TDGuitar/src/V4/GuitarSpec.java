package V4;

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

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public int getNumStrings() {
		return numStrings;
	}

	public boolean matches(GuitarSpec searchedSpec) {
		
		if(searchedSpec.getBuilder() != null 
				&& !searchedSpec.getBuilder().equals(builder)) {
			return false;
		}
		
		if(searchedSpec.getModel() != null 
				&& !searchedSpec.getModel().equals("")
					&& searchedSpec.getModel() != getModel()) {
			return false;
		}
		
		if(searchedSpec.getType() != null 
				&& !searchedSpec.getType().equals(getType())) {
			return false;
		}
		
		if(searchedSpec.getBackWood() != null 
				&& !searchedSpec.getBackWood().equals(getBackWood())) {
			return false;
		}
		
		if(searchedSpec.getTopWood() != null 
				&& !searchedSpec.getTopWood().equals(getTopWood())) {
			return false;
		}
		
		if(searchedSpec.getNumStrings() != NO_PREF_NUM_STRINGS
				&& searchedSpec.getNumStrings() != getNumStrings()) {
			return false;
		}
		return true;
	}

}

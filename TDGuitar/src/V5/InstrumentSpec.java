package V5;

public abstract class InstrumentSpec {

	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;

	
	
	public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
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


	public boolean matches(InstrumentSpec searchedSpec) {
		
		if (searchedSpec.getBuilder() != null && !searchedSpec.getBuilder().equals(builder)) {
			return false;
		}

		if (searchedSpec.getModel() != null && !searchedSpec.getModel().equals("")
				&& searchedSpec.getModel() != getModel()) {
			return false;
		}

		if (searchedSpec.getType() != null && !searchedSpec.getType().equals(getType())) {
			return false;
		}

		if (searchedSpec.getBackWood() != null && !searchedSpec.getBackWood().equals(getBackWood())) {
			return false;
		}

		if (searchedSpec.getTopWood() != null && !searchedSpec.getTopWood().equals(getTopWood())) {
			return false;
		}
		return true;
	}

}

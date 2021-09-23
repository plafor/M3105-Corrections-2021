package V5;

public class MandolinSpec extends InstrumentSpec{

	private Style style;

	public MandolinSpec(Builder builder, String model,Style style, Type type, Wood backWood, Wood topWood) {
		super(builder, model, type, backWood, topWood);
		this.style = style;
	}

	public Style getStyle() {
		return style;
	}


	@Override
	public boolean matches(InstrumentSpec searchedSpec) {
		if (!(searchedSpec instanceof MandolinSpec)) {
			return false;
		}
		
		MandolinSpec searchedMandolinSpec = (MandolinSpec)searchedSpec;
		
		if (searchedMandolinSpec.getStyle() != null && searchedMandolinSpec.getStyle() != getStyle()) {
			return false;
		}
		return super.matches(searchedSpec);
		
	}

}

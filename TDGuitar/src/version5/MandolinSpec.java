package version5;

public class MandolinSpec extends InstrumentSpec {
	private Style style;

	public MandolinSpec(Builder builder, String model, Style style, Type type, Wood backWood, Wood topWood) {
		super(builder, model, type, backWood, topWood);
		this.style = style;
	}

	public Style getStyle() {
		return style;
	}
	
	public boolean matches(InstrumentSpec searchInstrument) {
		if(!(searchInstrument instanceof MandolinSpec)) {
			return false;
		}
		MandolinSpec specs = (MandolinSpec)searchInstrument;
		if (specs.getStyle() != null 
				&& specs.getStyle() != getStyle()) {
			return false;
		}
		return super.matches(searchInstrument);
	}
}

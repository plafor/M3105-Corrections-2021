package version5;

public abstract class Instrument {
	
	private String serialNumber;
	private double price;
	private InstrumentSpec instrumentSpec;
	
	public Instrument(String serialNumber, double price, InstrumentSpec instrumentSpec) {
		super();
		this.serialNumber = serialNumber;
		this.price = price;
		this.instrumentSpec = instrumentSpec;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public InstrumentSpec getInstrumentSpec() {
		return instrumentSpec;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}

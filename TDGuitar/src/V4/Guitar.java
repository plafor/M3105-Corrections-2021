package V4;

public class Guitar {

	private String serialNumber;
	private double price;
	private GuitarSpec spec;

	public Guitar(String serialNumber, double price, GuitarSpec spec) {
		super();
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public GuitarSpec getSpec() {
		return spec;
	}

	public void setPrice(double price) {
		this.price = price;
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

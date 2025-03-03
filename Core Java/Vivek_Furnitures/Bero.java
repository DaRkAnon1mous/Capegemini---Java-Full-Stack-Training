
public abstract class Bero {
	protected String beroType;
	protected String beroColour;
	protected double price;
	
	public String getBeroType() {
		return beroType;
	}
	public void setBeroType(String beroType) {
		this.beroType = beroType;
	}
	public String getBeroColour() {
		return beroColour;
	}
	public void setBeroColour(String beroColour) {
		this.beroColour = beroColour;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Bero(String beroType, String beroColour) {
		setBeroType(beroType);
		setBeroColour(beroColour);
	}

	public abstract void calculatePrice();
	
	// Fill the code
	
}


public class WoodenBero extends Bero{
	
	// Fill the code
	private String woodType;
	

	public String getWoodType() {
		return woodType;
	}


	public void setWoodType(String woodType) {
		this.woodType = woodType;
	}
	public WoodenBero(String beroType, String beroColour,String woodType) {
		super(beroType, beroColour);
		setWoodType(woodType); 
		// TODO Auto-generated constructor stub
	}


	public void calculatePrice() {
		if(getWoodType().equals("Ply Wood")) {
			setPrice(15000.0);;
		}else if(getWoodType().equals("Teak Wood")) {
			setPrice(12000.0);;
		}else if(getWoodType().equals("Engineered Wood")) {
			setPrice(10000.0);;
		}
		// Fill the code
		
	}

}

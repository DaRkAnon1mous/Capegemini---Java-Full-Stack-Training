
public class SteelBero extends Bero{

	// Fill the code
	private int beroHeight;


	
	public int getBeroHeight() {
		return beroHeight;
	}


	public void setBeroHeight(int beroHeight) {
		this.beroHeight = beroHeight;
	}


	public SteelBero(String beroType, String beroColour,int beroHeight) {
		super(beroType, beroColour);
		setBeroHeight(beroHeight);
	
	}


	public void calculatePrice() {
		
		if(getBeroHeight()==3) {
			setPrice(5000.0);
		}else if(getBeroHeight()==5) {
			setPrice(8000.0);
		}else if(getBeroHeight()==7) {
			setPrice(10000);
		}
	}

}

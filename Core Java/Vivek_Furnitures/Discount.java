
public class Discount {
	
	public double calculateDiscount(Bero bObj) {
		// Fill the code
		if(bObj instanceof SteelBero) {
			return (bObj.price *10)/100;
		}else if(bObj instanceof WoodenBero) {
			return (bObj.price *15)/100;
		}else {
			return 0.0;
		}
		
	}
}

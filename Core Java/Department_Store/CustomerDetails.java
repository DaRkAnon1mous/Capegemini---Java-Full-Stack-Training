
public class CustomerDetails implements BonusPoints,DoorDelivery{
	
	// Fill the code
	private String customerName;
	private String phoneNumber;
	private String streetName;
	private double billAmount;
	private int distance;

	

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	
	public CustomerDetails(String customerName, String phoneNumber, String streetName, double billAmount,
			int distance) {
		setCustomerName(customerName);
		setPhoneNumber(phoneNumber);
		setStreetName(streetName);
		setBillAmount(billAmount);
		setDistance(distance);
		System.out.println("Customer name: "+getCustomerName());
		System.out.println("Phone number: "+getPhoneNumber());
		System.out.println("Street name: "+getStreetName());
	}

	public double calculateBonusPoints() {
		if(getBillAmount()>=250) {
			return getBillAmount()/10;
		}else {
			return 0.0;
		}
	}

	public double deliveryCharge() {
		// Fill the code
		if(getDistance()>=25) {
			return getDistance()*8.0;
		}else if(getDistance()>=15 && getDistance()<25) {
			return getDistance()*5.0;
		}else {
			return getDistance()*2.0;
		}
	}
	
}

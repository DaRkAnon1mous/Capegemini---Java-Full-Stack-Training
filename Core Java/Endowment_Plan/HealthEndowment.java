public class HealthEndowment extends Endowment{
	
	// Fill the code
	private String healthCareCenter;
	private int holderAge;

	
	

	public String getHealthCareCenter() {
		return healthCareCenter;
	}


	public void setHealthCareCenter(String healthCareCenter) {
		this.healthCareCenter = healthCareCenter;
	}


	public int getHolderAge() {
		return holderAge;
	}


	public void setHolderAge(int holderAge) {
		this.holderAge = holderAge;
	}

	public HealthEndowment(String endowmentId, String holderName, String endowmentType, String registrationDate,String healthCareCenter,int holderAge) {
		super(endowmentId, holderName, endowmentType, registrationDate);
		setHealthCareCenter(healthCareCenter);
		setHolderAge(holderAge);
		// TODO Auto-generated constructor stub
	}

	public double calculateEndowment(){
		// Fill the code
		if(holderAge<=30) {
			return 120000.00;
		}else if(holderAge>30&&holderAge<60) {
			return 200000.00;
		}else{
			return 500000.00;
		}
	}

}


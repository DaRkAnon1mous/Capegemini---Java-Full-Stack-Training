import java.util.Scanner;
public class DayScholar extends Student{
	
	// Fill the code
	private int busNumber;
	private float distance;
	
	public int getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}



	public DayScholar(int studentId, String studentName, String department, String gender, String category,
			double collegeFee,int busNumber,float distance) {
		super(studentId, studentName, department, gender, category, collegeFee);
		setBusNumber(busNumber);
		setDistance(distance);
	}

	public double calculateTotalFee() {
		
		if(getDistance()>30 && getDistance()<=40) {
			return getCollegeFee()+28000;
			
		}else if(getDistance()>20 && getDistance()<=30) {
			return getCollegeFee()+20000;
			
		}else if(getDistance()>10 && getDistance()<=20) {
			return getCollegeFee()+12000;
			
		}else {
			return getCollegeFee()+6000;
		}
	}


}
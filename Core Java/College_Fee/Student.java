import java.util.Scanner;
public abstract class Student {

	// Fill the code
	protected int studentId;
	protected String studentName;
	protected String department;
	protected String gender;
	protected String category;
	protected double collegeFee;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getCollegeFee() {
		return collegeFee;
	}
	public void setCollegeFee(double collegeFee) {
		this.collegeFee = collegeFee;
	}
	public Student(int studentId, String studentName, String department, String gender, String category,
			double collegeFee) {
		setStudentId(studentId);
		setStudentName(studentName);
		setDepartment(department);
		setGender(gender);
		setCategory(category);
		setCollegeFee(collegeFee);
	}
	
	
	public abstract double calculateTotalFee();

	
}






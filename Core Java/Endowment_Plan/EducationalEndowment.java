
public class EducationalEndowment extends Endowment{
	
	// Fill the code
	private String educationalInstitution;
	private String educationalDivision;

	public String getEducationalInstitution() {
		return educationalInstitution;
	}

	public void setEducationalInstitution(String educationalInstitution) {
		this.educationalInstitution = educationalInstitution;
	}

	public String getEducationalDivision() {
		return educationalDivision;
	}

	public void setEducationalDivision(String educationalDivision) {
		this.educationalDivision = educationalDivision;
	}

	public EducationalEndowment(String endowmentId, String holderName, String endowmentType, String registrationDate,String educationalInstitution,String educationalDivision) {
		super(endowmentId, holderName, endowmentType, registrationDate);
		setEducationalInstitution(educationalInstitution);
		setEducationalDivision(educationalDivision);
		// TODO Auto-generated constructor stub
	}

	public double calculateEndowment(){
		// Fill the code
		
		if(getEducationalDivision().equalsIgnoreCase("School")) {
			return 30000.00;
		}else if(getEducationalDivision().equalsIgnoreCase("UnderGraduate")){
			return 60000.00;
		}else if(getEducationalDivision().equalsIgnoreCase("PostGraduate")) {
			return 90000.00;
		}
		else {
			return 0;
		}
	}

}
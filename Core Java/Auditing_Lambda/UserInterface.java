import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UserInterface {
	
	private static Map <String,Double> employeeMap = new HashMap<>();

	public Map<String, Double> getEmployeeMap() {
		return employeeMap;
	}

	public void setEmployeeMap(Map<String, Double> employeeMap) {
		this.employeeMap = employeeMap;
	}
	
	public void addEmployeeDetails(String employeeName, double salary)
	{
		// Fill the code
		employeeMap.put(employeeName,salary);
	}
	
	
	
	public static EmployeeAudit findEmployee()
	{
		return(salary)->{
			ArrayList<String> name= new ArrayList<>();
		    for(Map.Entry<String,Double> entry : employeeMap.entrySet()) {
		    	if (entry.getValue() <= salary) {
					name.add(entry.getKey());
				}
		}
		    return name;
		};
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.Add Employee Details"
		            +"\n"+"2.Find Employee Details"
					+"\n"+"3.Exit"
		            +"\n"+ "Enter the choice");
			int a = sc.nextInt();
			sc.nextLine();
			switch(a) {
			case 1:
				System.out.println("Enter the Employee name");
				String s1 = sc.nextLine();
				System.out.println("Enter the Employee Salary");
				double s2 = sc.nextDouble();
				sc.nextLine();
				UserInterface ui = new UserInterface();
				ui.addEmployeeDetails(s1, s2);
	            break;
			case 2:
				System.out.println("Enter the salary to be searched");
				double s3 = sc.nextDouble();
				EmployeeAudit ea = findEmployee();
				ArrayList<String> res = ea.fetchEmployeeDetails(s3);
				if(res.isEmpty()) {
					System.out.println("No Employee Found");
				}else {
					System.out.println("Employee List\n"+String.join(" ", res));
				}
				break;
			case 3:
				System.out.println("Let's complete the session");
				return;
			}
		}
		// Fill the code
	}

}

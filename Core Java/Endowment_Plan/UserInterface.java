import java.util.Scanner;

public class UserInterface {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		// Fill the code
		System.out.println("Enter Endowment Id");
		String s1 = sc.nextLine();
		System.out.println("Enter Holder Name");
		String s2 = sc.nextLine();
		System.out.println("Enter Endowment Type");
		String s3 = sc.nextLine();
		if (s3.equalsIgnoreCase("Educational")) {
			
			System.out.println("Enter Registration Date");
			String s4 = sc.nextLine();
			System.out.println("Enter Educational Institution");
			String s5 = sc.nextLine();
			System.out.println("Enter Educational Division");
			String s6 = sc.nextLine();
			
			EducationalEndowment ee = new EducationalEndowment(s1,s2,s3,s4,s5,s6);
			System.out.printf("Endowment Amount %.2f",ee.calculateEndowment());
			
		} else if (s3.equalsIgnoreCase("health")) {
			
			System.out.println("Enter Registration Date");
			String s4 = sc.nextLine();
			System.out.println("Enter Health Care Center");
			String s5 = sc.nextLine();
			System.out.println("Enter Holder Age");
			int s6 = sc.nextInt();
			sc.nextLine();
			
			HealthEndowment he = new HealthEndowment(s1,s2,s3,s4,s5,s6);
			System.out.printf("Endowment Amount %.2f",he.calculateEndowment());
			
		} else {
			System.out.println(s3 + " is an invalid endowment type");
			sc.close();
			return;
		}
		sc.close();
	}

}

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Country co = new Country();
		while(true) {
		System.out.println("1.Add"
				+ "\n"
				+ "2.Search"
				+ "\n"
				+ "3.Exit\n"
				+ "Enter your choice");
		int choice = sc.nextInt();
		sc.nextLine();
		switch(choice) {
		case 1:
			System.out.println("Enter the country name");
			String s1 = sc.nextLine();
			System.out.println("Enter the capital name");
			String s2 = sc.nextLine();
			co.add(s1, s2);
			break;
		case 2:
			if(co.getCountryMap().isEmpty()) {
				System.out.println("The map is empty");
				break;
			}
			System.out.println("Enter the country name");
			String s3 = sc.nextLine();
			
			System.out.println(co.search(s3));   
			break;
		case 3:
			System.out.println("Thank you for using the application");
			sc.close();
			return;
		}
		// Write code here
		
	}
	}
}

import java.util.Scanner;

public class UserInterface {

		public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		// Fill the code
		System.out.println("Enter the customer name");
		String s1 = sc.nextLine();
		System.out.println("Enter the phone number");
		String s2 = sc.nextLine();
		System.out.println("Enter the street name");
		String s3 = sc.nextLine();
		System.out.println("Enter the bill amount");
		double s4 = sc.nextDouble();
		System.out.println("Enter the distance");
		int s5 = sc.nextInt();
		sc.nextLine();
		CustomerDetails cd = new CustomerDetails(s1, s2, s3, s4, s5);

		System.out.println("Bonus points: "+cd.calculateBonusPoints());
		System.out.println("Delivery charge: "+cd.deliveryCharge());
		sc.close();
	}
}

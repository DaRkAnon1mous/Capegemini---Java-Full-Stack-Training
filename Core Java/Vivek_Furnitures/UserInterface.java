import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// Fill the code
		System.out.println("Enter Customer Name");
		String s1 = sc.nextLine();
		System.out.println("Enter Phone Number");
		long s2 = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter address");
		String s3 = sc.nextLine();
		System.out.println("Enter Bero Type");
		String s4 = sc.nextLine();
		if(s4.equals("Steel Bero")) {
			System.out.println("Enter Bero Colour");
			String s5 = sc.nextLine();
			System.out.println("Enter Bero Height");
			int s6 = sc.nextInt();
			Bero bObj = new SteelBero(s4,s5,s6);
			bObj.calculatePrice();
			Discount d = new Discount();
			System.out.printf("Amount needs to be paid %.2f",bObj.price-d.calculateDiscount(bObj));
		}else if(s4.equals("Wooden Bero")) {
			System.out.println("Enter Bero Colour");
			String s5 = sc.nextLine();
			System.out.println("Enter Wood Type");
			String s6 = sc.nextLine();
			Bero bObj = new WoodenBero(s4, s5, s6);
			bObj.calculatePrice();
			Discount d = new Discount();
			System.out.printf("Amount needs to be paid %.2f",bObj.price-d.calculateDiscount(bObj));
		}else {
			System.out.printf(s4+" is an invalid bero type");
			sc.close();
			return;
		}
		sc.close();
	}

}

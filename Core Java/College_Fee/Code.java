import java.util.Scanner;

public class Code {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
    		// Fill the code
		System.out.println("Enter Student Id");
		int s1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student name");
		String s2 = sc.nextLine();
		System.out.println("Enter Department name");
		String s3 = sc.nextLine();
		System.out.println("Enter gender");
		String s4 = sc.nextLine();
		System.out.println("Enter category");
		String s5 = sc.nextLine();
		if(s5.equals("DayScholar")) {
			System.out.println("Enter College fee");
			double s6 = sc.nextDouble();
			System.out.println("Enter Bus number");
			int s7 = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the distance");
			float s8 = sc.nextFloat();
			sc.nextLine();
			Student s = new DayScholar(s1, s2, s3, s4, s5, s6, s7, s8);
			System.out.println("Total College fee is "+s.calculateTotalFee());
			
		}else if(s5.equals("Hosteller")) {
			System.out.println("Enter College fee");
			double s6 = sc.nextDouble();
			System.out.println("Enter the room number");
			int s7 = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Block name");
			char s8 = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("Enter the room type");
			String s9 = sc.nextLine();
			Student s = new Hosteller(s1, s2, s3, s4, s5, s6, s7, s8, s9);
			System.out.println("Total College fee is "+s.calculateTotalFee());
			
		}


	}

}
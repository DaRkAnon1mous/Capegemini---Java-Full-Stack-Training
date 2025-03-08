import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		NumAvg na = new NumAvg();
		while(true) {
		System.out.println("1.Add number"
				+ "\n"
				+ "2.Find average"
				+ "\n"
				+ "3.Exit\n"
				+ "Enter your choice");
		int choice = sc.nextInt();
		sc.nextLine();
		switch(choice) {
		case 1:
			System.out.println("Enter the number");
			int i = sc.nextInt();
			sc.nextLine();
			na.addNum(i);
			break;
		case 2:
			if(na.calAvg()==-1) {
				System.out.println("The set is empty");
				break;
			}
			System.out.println(na.calAvg());
			break;
		case 3:
			System.out.println("Thank you for using the application");
			sc.close();
			return;
		}
		// code here
		
		
		}
	
	}
}



import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Car co = new Car();
		while(true) {
			System.out.println("1.Add car"
					+ "\n"
					+ "2.Search by name"
					+ "\n" 
					+ "3.Search by count\n" 
					+ "4.Total\n"
					+ "5.Exit\n"
					+ "Enter your choice");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				System.out.println("Enter the car name");
				String s1 = sc.nextLine();
				System.out.println("Enter no of cars sold");
				int s2 = sc.nextInt();
				sc.nextLine();
				co.addCar(s1, s2);
				break;
			case 2:
				if(co.getCarMap().isEmpty()) {
					System.out.println("The map is empty");
					break;
				}
				System.out.println("Enter the car name");
				String s3 = sc.nextLine();
				if(co.carByName(s3)==-1) {
					System.out.println("Car not found");
					break;
				}
				System.out.println(co.carByName(s3));   
				break;
			case 3:
				if(co.getCarMap().isEmpty()) {
					System.out.println("The map is empty");
					break;
				}
				System.out.println("Enter the count");
				int s4 = sc.nextInt();
					sc.nextLine();
					if(co.carByCount(s4)==null) {
						System.out.println("No cars found");
						break;
					}
			    co.carByCount(s4).forEach(System.out::println);
				break;
			case 4:
				if(co.getCarMap().isEmpty()) {
					System.out.println("The map is empty");
					break;
				}
				System.out.println(co.totalCarsSold()); 
				break;
			case 5:
				System.out.println("Thank you for using the application");
				sc.close();
				return;
			}
			// Write code here
			
		}
		// Code here
		
	}
}


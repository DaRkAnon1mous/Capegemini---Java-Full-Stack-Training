import java.util.*;

public class UserInterface {

	public static void main(String[] args) {

		// Fill the code here
		Scanner sc = new Scanner(System.in);
		FruitBasketUtility fbu = new FruitBasketUtility();
		
		while (true) {
			System.out.println("Select an option:\n1.Add Fruit to Basket\n2.Calculate Bill\n3.Exit");
			int option = sc.nextInt();
			sc.nextLine();
			switch (option) {
			case 1:
				System.out.println("Enter the fruit name");
				String s = sc.nextLine();
				//fb.setFruitName(s);
				System.out.println("Enter weight in Kgs");
				int w = sc.nextInt();
				//fb.setWeightInKgs(w);
				sc.nextLine();
				System.out.println("Enter price per Kg");
				int p = sc.nextInt();
				//fb.setPricePerKg(p);
				//sc.nextLine();
				FruitBasket fb = new FruitBasket(s,w,p);
				fbu.addToBasket(fb);
				break;
			case 2:
				if(fbu.getFruitBasketList().isEmpty()) {
					System.out.println("Your basket is empty. Please add fruits.");
					break;
				}
				int fb1 = fbu.calculateBill(fbu.getFruitBasketList().stream());

				System.out.println("The estimated bill amount is Rs " + fb1);
				break;
			case 3:
				System.out.println("Thank you for using the application.");
				sc.close();
				return;
			default:
				System.out.println("Invalid option. Please try again.");
				break;

			}
		}
	}

}

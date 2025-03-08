import java.util.*;

public class UserInterface {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Products p = new Products();
		while (true) {
			System.out.println("1.Add\n2.Display\n3.Exit\nEnter your choice");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Enter the product");
				String s = sc.nextLine();
				
				p.addProductToList(s);
				break;
			case 2:
				p.sortProductList();
				if (p.getProductList().isEmpty()) {
					System.out.println("The list is empty");
					break;
				}
				p.getProductList().forEach(System.out::println);
				break;

			case 3:
				System.out.println("Thank you for using the application");
				return;
			}
		}
		// code here

	}
}

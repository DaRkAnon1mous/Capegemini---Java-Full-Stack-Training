
import java.util.*;
import java.util.Comparator;
public class Product {
	//Include the attributes
	private int productid;
	private String productName;
	private double price;
	
	//Include the getters and setters for the attributes
	public void setProductId(int productid) {
		this.productid=productid;
	}
	public void setProductName(String productName) {
		this.productName=productName;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	
	public int getProductId() {
		return productid;
	}
	public String getProductName() {
		return productName;
	}
	public double getPrice() {
		return price;
	}
	//Include three argument constructor to initialize values	
	public Product(int productid,String productName,double price) {
		setProductId(productid);
		setProductName(productName);
		setPrice(price);
	}
	//This method should return the productId, productName and price seperated by whitespace
	public String toString()
    	{
            return getProductId()+" "+getProductName()+" "+getPrice();
    	}
	
}


public class SortById implements Comparator<Product> {
	public int compare(Product a,Product b) {
        return a.getProductId() - b.getProductId();
    }
}


public class SortByPrice implements Comparator<Product>{
	public int compare(Product a, Product b) {
		return (int) (a.getPrice() - b.getPrice());
    }
}


public class UserInterface {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		// Fill the code here
		
		System.out.println("Enter products count");
		int n = sc.nextInt();
		if(n<=0) {
			System.out.println("Invalid count");
			return;
		}
		sc.nextLine();
		List<Product> productList = new ArrayList<>();
		System.out.println("Enter Products details");
		for(int i=0;i<n;i++) {
			String s = sc.nextLine();
			String[] p = s.split(":");
			
			
            int productid = Integer.parseInt(p[0]);
            String productName = p[1];
            double price = Double.parseDouble(p[2]);

                // Create Product object
            productList.add(new Product(productid, productName, price));
        
		}
		System.out.println("1.Sort By Id");
		System.out.println("2.Sort By Price");
		System.out.println("Enter your choice");
		int num2 = sc.nextInt();	
		sc.nextLine();
		if(num2!=1&&num2!=2) {
			System.out.println("Invalid choice");
			return;
		}
		switch(num2) {
		case 1:
			Collections.sort(productList,new SortById());
			System.out.println("After Sorting by Id");
			break;
		case 2:
			Collections.sort(productList, new SortByPrice());
            System.out.println("After Sorting By Price");
            break;
		}
		
		for (Product p : productList) {
            System.out.println(p);
        }
		
		sc.close();
	}

}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class UserInterface {
	public static void main(String [] args)
	{	
		//FILL THE CODE HERE
		Scanner sc=new Scanner(System.in);
		Carton c = new Carton();
		CartonUtility cu = new CartonUtility();
		List<Carton> cartonList = new ArrayList<>();
		System.out.println("Enter the number of cartons");
		int a = sc.nextInt();
		sc.nextLine();
		if(a<=0) {
			System.out.println("Invalid");
			sc.close();
			return;
		}
	    String[] s = new String[a];
	    System.out.println("Enter carton details");
	    for(int i=0;i<a;i++) {
	    	s[i]=sc.nextLine();
	    	String s1[] =s[i].split("/");
	    	String s2 = s1[0];
	    	int s3 = Integer.parseInt(s1[1]);
	    	if(s3<=0) {
	    		System.out.println("Quantity number should be a valid number");
	    		sc.close();
	    		return;
	    	}
	    	int s4 = Integer.parseInt(s1[2]);
	    	if(s4<=0) {
	    		System.out.println("Quantity number should be a valid number");
	    		sc.close();
	    		return;
	    	}
	    	c.setProductName(s2);
	    	c.setQuantity(s3);
	    	
	    	c.setProductCost(s4);
	    	cartonList.add(c);
	    }
	    
//	    for(String e:s) {
//	    	String s1[] =e.split("/");
//	    	String s2 = s1[0];
//	    	int s3 = Integer.parseInt(s1[1]);
//	    	if(s3<=0) {
//	    		System.out.println("Quantity number should be a valid number");
//	    		sc.close();
//	    		return;
//	    	}
//	    	int s4 = Integer.parseInt(s1[2]);
//	    	if(s4<=0) {
//	    		System.out.println("Quantity number should be a valid number");
//	    		sc.close();
//	    		return;
//	    	}
//	    	c.setProductName(s2);
//	    	c.setQuantity(s3);
//	    	
//	    	c.setProductCost(s4);
//	    	cartonList.add(c);
//	    }
	    cu.setCartonList(cartonList);
	    
	   
	    Carton maxCarton = cu.findMax(cu.convertToStream()); 

	    if (maxCarton != null) {
	        System.out.println(maxCarton.getProductName() + "  had the highest quantity with " + maxCarton.getQuantity() +" nos"); 
	    }
	    
	}

}

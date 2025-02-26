import java.util.Scanner;

public class Code 
{
	public static void main(String args[]) 
	{
	
		Scanner sc =new Scanner(System.in);
		//Fill the code
		System.out.println("Enter the details");
	    String[] s= sc.nextLine().split(":");
	    
	    String s1 = s[0];
	    int s2 = Integer.parseInt(s[1]);
	    int s3 = Integer.parseInt(s[2]);
	    int s4 = Integer.parseInt(s[3]);
	    int s5 = Integer.parseInt(s[4]);
	    if(s2<18) {
	    	System.out.println(s2+" is an invalid age");
	    	return;
	    }
	    if(s3<0) {
	    	System.out.println(s3+" is an invalid input");
	    	return;
	    }
	    if(s4<0) {
	    	System.out.println(s4+" is an invalid input");
	    	return;
	    }
	    if(s5<0) {
	    	System.out.println(s5+" is an invalid input");
	    	return;
	    }
	    int bg = (s3*10)+(s4*6)+(s5*3);
	    System.out.println(s1+" scored "+bg+" points");
		
		
		
		
	}
	
}	

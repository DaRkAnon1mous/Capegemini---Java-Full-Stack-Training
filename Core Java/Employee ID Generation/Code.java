import java.util.Scanner;

public class Code 
{
	public static void main(String args[]) 
	{
	
		Scanner sc =new Scanner(System.in);
		//Fill the code
		System.out.println("Enter the training id");
	    String s= sc.nextLine();
	    if(s.length()!=9) {
	    	System.out.println(s+" is an invalid training id");
	    	return;
	    }
	    String s1 = s.substring(0,4);
	    String s2 = s.substring(4,6);
	    int s3 = Integer.parseInt(s.substring(6,9));
	    if(!s1.equals("2021")) {
	    	System.out.println(s1+" is an invalid year");
	    	return;
	    }
	    s1 = "SIET";
	    switch(s2) {
	    case "01":
	    	s2 = "LP";
	    	break;
	    case "02":
	    	s2 = "TA";
	    	break;
	    case "03":
	    	s2 = "CT";
	    	break;
	    case "04":
	    	s2 = "PT";
	    	break;
	    case "05":
	    	s2 = "TT";
	    	break;
	    default:
	    	System.out.println(s2+" is an invalid team code");
	    	return;
	    }
	    if(s3<=0||s3>999) {
	    	System.out.println(String.format("%03d", s3)+" is an invalid roll number");
	    	return;
	    }
		System.out.println("Employee Id: "+s1+s2+String.format("%03d", s3));
		
		
	}
	
}	

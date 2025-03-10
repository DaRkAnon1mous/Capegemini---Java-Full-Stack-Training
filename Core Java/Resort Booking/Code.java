import java.util.Scanner;

public class Code {
    public static void main(String args[])
    {
    //fill the code here
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the customer details");
    String[] s= sc.nextLine().split(":");
    
    String s1 = s[0];
    int s2 = Integer.parseInt(s[1]);
    int s3 = Integer.parseInt(s[2]);
    int s4 = Integer.parseInt(s[3]);
    if(s2<0) {
    	System.out.println("Invalid input for number of adults");
    	return;
    }
    if(s3<0) {
    	System.out.println("Invalid input for number of children");
    	return;
    }
    if(s4<=0) {
    	System.out.println("Invalid input for number of days");
    	return;
    }
    int s5 = s2*s4*1000;
    int s6 = s3*s4*650;
    System.out.println(s1+" your booking is confirmed and the total cost is "+ (s5+s6));
    

    
    }

}

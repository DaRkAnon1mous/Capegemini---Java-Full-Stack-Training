// Don't Change the Structure

import java.util.Scanner;

public class UserInterface 
{
	public static int addition(int... a) {
		int sum=0;
		System.out.println("Number of arguments is "+a.length);
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;

	}
	public static void main(String args[]) 
	{
		Scanner sc =new Scanner(System.in);
		//Call the addition method with two arguments 10,15
		int b = addition(10,15);
		System.out.println("Total "+b);
		
		//Call the addition method with three arguments 10,20,30
		
		int c =addition(10,20,30);
		System.out.println("Total "+c);
		
		//Call the addition method with six arguments 10,30,60,100,5,15
		int d = addition(10,30,60,100,5,15);
		System.out.println("Total "+d);
		 sc.close();
		
	}
	
	
	 //Include the public static int addition(int... a) method
	
	 
}
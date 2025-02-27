import java.util.Scanner;
import java.util.regex.Pattern;
public class Code 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		// Fill code here
		boolean a,b;
		System.out.println("Enter your name");
		String s1 = sc.nextLine();
		System.out.println("Enter your PAN number");
		String s2 = sc.nextLine();
		a = Pattern.matches("[A-Z]{5}[0-9]{4}[A-Z]", s2);
		if(!a) {
			System.out.println(s2+" is an invalid PAN number");
			return;
		}
		System.out.println("Enter your E-mail ID");
		String s3 = sc.nextLine();
		b = Pattern.matches("[a-z]{5,10}(@digitec.com)", s3);
		if(!b) {
			System.out.println("Invalid E-mail ID");
			return;
		}
		System.out.printf("Profile of %s updated successfully",s1);
	}
}
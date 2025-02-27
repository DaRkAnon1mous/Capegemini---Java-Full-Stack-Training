import java.util.Scanner;
public class Code 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//Fill code here 
		System.out.println("Enter your profile code");
		String s = sc.nextLine();
		if(s.length()!=8) {
			System.out.println(s+" does not have the specified length");
			sc.close();
			return;
		}
		
		
		if(!s.startsWith("#")) {
			System.out.println(s+" does not start with a valid special character");
			sc.close();
			return;
		}
		String up = s.substring(1,5);
		int upc = 0;
        for (char ch : up.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upc++;
            }
        }
		if(upc !=4) {
			System.out.println(upc+" is an invalid number for uppercase character");
			sc.close();
			sc.close();
			return;
		}
		String d = s.substring(5);
		if(!d.matches("[0-9]{3}")) {
			System.out.println(d.length()-1+" is an invalid number for digits");
			sc.close();
			return;
		}
		
		
		
		System.out.println(s+" is a valid profile code whose last 3 digits are "+d);;
		sc.close();
	}
}
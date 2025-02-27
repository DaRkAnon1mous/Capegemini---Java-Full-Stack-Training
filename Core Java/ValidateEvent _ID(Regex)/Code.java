import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Code 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//Fill code here 
		boolean a,b;
		
		System.out.println("Enter your name");
		String s1 = sc.nextLine();
		System.out.println("Enter your ID");
		String s2 = sc.nextLine();
		String p1 = "(SPC)([0-9]{3})(0[1-9]|1[0-2])(AM|PM)";
		Pattern p = Pattern.compile(p1);
		Matcher m = p.matcher(s2);
		if(m.find()) {
			System.out.println("Hi "+s1+" your seat number is "+Integer.parseInt(m.group(2))+" and the event starts at "+Integer.parseInt(m.group(3))+m.group(4));
			return;
		}else {
			System.out.println(s2+" is an Invalid ID");
		}
		sc.close();
	}
}
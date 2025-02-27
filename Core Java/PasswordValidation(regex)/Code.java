import java.util.Scanner;
import java.util.regex.*;
public class Code
{
	public static int countMatches(String i, Pattern p) {
		Matcher m = p.matcher(i);
		int count = 0;
		while (m.find()) {
            count += m.group().length(); // Count all occurrences properly
        }
		return count;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//Fill code here 
		System.out.println("Generate your password");
		String s = sc.nextLine();
		if(s.length()<6||s.length()>12) {
			System.out.println(s+" is an invalid password");
			return;
		}
		String p1 = "[a-z]+";
		String p2 = "[A-Z]+";
		String p3 = "[0-9]?";
		String p4 = "[@$*#]{1}";
		Pattern u1 = Pattern.compile(p1);
		Pattern u2 = Pattern.compile(p2);
		Pattern u3 = Pattern.compile(p3);
		Pattern u4 = Pattern.compile(p4);
		
		int i1 = countMatches(s,u1);
		int i2 = countMatches(s,u2);
		int i3 = countMatches(s,u3);
		int i4 = countMatches(s,u4);
		
		
		if(i1 > 0 && i2 > 0 && i3 >= 0 && i4 > 0) {
			System.out.println("The generated password " + s + " is valid and has " +i1 + " lowercase alphabet " +i2 + " uppercase alphabet " +i4 + " special character " +i3 + " digit");
		}else {
			System.out.println(s+" is an invalid password");
		}
		sc.close();
	}
}
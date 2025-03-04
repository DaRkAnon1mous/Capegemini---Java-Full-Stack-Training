import java.util.Scanner;

public class UserInterface {
	
	public static void main(String args[])
    {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the String");
		   String s = sc.nextLine();
		   System.out.println("Enter First Index");
		   int a = sc.nextInt();
		   System.out.println("Enter Second Index");
		   int b = sc.nextInt();
       UserInterface ui = new UserInterface();
       String res2 = ui.extractString(s, a, b);
       System.out.println(res2);
       sc.close();
       // Fill the code
    }
	
	public String extractString(String sentence,int number1,int number2)
    { StringBuilder res = new StringBuilder();
		try {
			
			  res.append("The output string is "+sentence.substring(number1,number2));
			   
		} catch (StringIndexOutOfBoundsException e) {
			res.append("Invalid index position");
		} finally {
			res.append(". Thanks for using the application.");
		}
		return res.toString();
    }

}

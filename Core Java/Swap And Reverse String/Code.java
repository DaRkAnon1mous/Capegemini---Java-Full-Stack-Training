import java.util.Scanner;

public class Code 
{
	public static boolean checkStr(String n) {
		char c[] = n.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(!(Character.isLetter(c[i])||c[i]==' ')) {
				return false;
			}
		}
		return true;
	}
		
	public static String reverseS(String m) {
		String rev="";
		for(int i=m.length()-1;i>=0;i--) {
			rev += m.charAt(i);
		}
		return rev;
	}
	public static void main(String args[]) 
	{
	
		Scanner sc =new Scanner(System.in);
		//Fill the code
		System.out.println("Enter the sentence");
		String[] s= sc.nextLine().split(" ");
		if(s.length<=2) {
			System.out.println("Invalid Length");
			return;
		}
		for(int i=0;i<s.length;i++) {
			if(!checkStr(s[i])) {
				for(int j=0;j<s.length;j++) {
					System.out.print(s[j]+" ");
				}
				System.out.print("is an invalid sentence ");
				return;
				
			}
			
		}
		
		for(int i =1;i<s.length-1;i++) {
		    s[i] = reverseS(s[i]);
		}
		for(int j=0;j<s.length/2;j++) {
			String temp=s[j];
			s[j]=s[s.length-1-j];
			s[s.length-1-j]=temp;
			}
		for(int j=0;j<s.length;j++) {
			System.out.print(s[j]+" ");
		}
		
	}
	
}	

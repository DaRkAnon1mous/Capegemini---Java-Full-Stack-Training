import java.util.*;
public class Code
{
	public static boolean checkStr(String n) {
		char[] c = n.toCharArray();
	
		for(int i=0;i<c.length;i++) {
		if(!(Character.isLetter(c[i])|| c[i]==' ') ){
			return false;
		}
		}
		return true;
	}
	public static String reOrder(String m) {
		char[] c = m.toCharArray();
		Arrays.sort(c);
		String s = new String(c);
		return s;
	}
	public static void main(String[] args)
	{
        
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the sentence");
			String[] s1= sc.nextLine().split(" ");
			for(int i=0;i<s1.length;i++) {
				if(!checkStr(s1[i])) {
					for(int j=0;j<s1.length;j++) {
						System.out.print(s1[j]+" ");
					}
					System.out.print("is an invalid input ");
					return;
					
				}
				
			}
			for(int i=0;i<s1.length;i++) {
				s1[i] = reOrder(s1[i]);
			}
			for(int i=0;i<s1.length;i++) {
				System.out.print(s1[i]+" ");
			}
	        //Fill the code here
	        
	    }

}

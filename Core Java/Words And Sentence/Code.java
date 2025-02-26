import java.util.Scanner;

public class Code 
{
	public static void main(String args[]) 
	{
	
		Scanner sc =new Scanner(System.in);
		//Fill the code
		System.out.println("Enter the sentence");
		String[] s= sc.nextLine().split(" ");
		System.out.println("Enter the word");
		String p = sc.nextLine();
		boolean f =false;
		for(int i=0;i<s.length;i++) {
			if(s[i].equals(p)) {
				f =true;
				break;
			}
		}
		if(f) {
		System.out.println(p+" is present in the sentence");
		}else {
			System.out.println(p+" is not present in the sentence");
		}
		sc.close();
	}
	
}	

import java.util.Scanner;
public class Code {
	public static boolean validateStrings(String s1, String s2) {
		boolean isS1Wrong = false, isS2Wrong = false;

        // Check if both strings contain only alphabets, '!' or space
		for (int i = 0; i < s1.length(); i++) {  
		    char ch = s1.charAt(i);
		    if (!(Character.isLetter(ch) || ch == '!' || ch == ' ')) { 
		        isS1Wrong = true; 
		        break; 
		    }
		}

        for (char ch : s2.toCharArray()) {
            if (!(Character.isLetter(ch) || ch == '!' || ch == ' ')) {
                isS2Wrong = true;
                break;
            }
        }

        // Print appropriate error messages
        if (isS1Wrong && isS2Wrong) {
            System.out.println(s1 + " and " + s2 + " contains invalid symbols");
            return false;
        } else if (isS1Wrong) {
            System.out.println(s1 + " contains invalid symbols");
            return false;
        } else if (isS2Wrong) {
            System.out.println(s2 + " contains invalid symbols");
            return false;
        }

        return true;
    }

	
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        //fill the code here
       System.out.println("Enter the first string");
       String s1 = sc.nextLine();
       
       System.out.println("Enter the second string");
       String s2 = sc.nextLine();
       
       
       if(!validateStrings(s1, s2)) {
    	   sc.close();
    	   return;
       }
       if(s1.length()!=s2.length()) {
    	   System.out.println("Length of the strings "+ s1+" and "+s2+" does not match");
    	   sc.close();
    	   return;
       }
      
       StringBuilder result = new StringBuilder(s1);
       for (int i = 0; i < s1.length(); i++) {
           if (s1.charAt(i) == '!') {
               result.setCharAt(i, s2.charAt(i));
           }
       }

       // Output final corrected string
       System.out.println(result.toString());
       
      
       sc.close();
    }
}

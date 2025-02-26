import java.util.*;
public class Code {
    public static void main(String args[])
    {
        // fill the code here
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of teams");
        int a = sc.nextInt();
        if(a<2) {
        	System.out.println(a+" is an invalid input");
        	return;
        }
        sc.nextLine();
        float[] res1 = new float[a];
        String[] name = new String[a];
        System.out.println("Enter the details");
        for(int i=0;i<a;i++) {
        String[] s= sc.nextLine().split(":");
        
        String s1 = s[0];
        name[i]=s1;
        try {
        float s2 = Float.parseFloat(s[1]);
        float s3 = Float.parseFloat(s[2]);
        float s4 = Float.parseFloat(s[3]);
        float s5 = Float.parseFloat(s[4]);
        if(s2<1||s3<1||s4<1||s5<1) {
        	System.out.println("Invalid number");
        	return;
        }
        
        res1[i] = s2+s3+s4+s5;
        }catch(Exception e) {
        	System.out.println("Invalid number");
            return;
        }
        }
        
        float min = res1[0];
        int index = 0;
        for(int j =1;j<res1.length;j++) {
        	if(res1[j]<min) {
        		min=res1[j];
        		index = j;
        	}
        }

        System.out.printf("%s team wins the race in %.2f minutes",name[index],min);
        sc.close();
    }
    

}

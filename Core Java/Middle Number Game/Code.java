import java.util.Scanner;
public class Code {
	public static int add(int[] arr,int a,int b) {
		int sum = 0;
		for(int i=a; i<b;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	public static int mul(int[] arr,int a,int b) {
		if(b-a==0) {
			return 0;
		}
		int mul=1;
		for(int i=a; i<b;i++) {
			mul*=arr[i];
		}
		return mul;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Fill the code here 
		System.out.println("Enter the size of the array");
	       int num = sc.nextInt();
	       
	       if(num<=0|| num>10){
	           System.out.println("Please enter a valid number");
	           return;
	       }
	       if(num%2==0) {
	    	   System.out.println("Please enter an odd number");
	    	   return;
	       }
	       int[] arr = new int[num];
	       System.out.println("Enter the elements");
	       for(int i=0;i<num;i++){
	           arr[i]=sc.nextInt();
	           if(arr[i]<=0 || arr[i]>10) {
	        	   System.out.println("Please enter valid elements in the array");
	        	   return;
	        	 }
	       }
	       if (num == 1) {
	            System.out.println("The sum of the values is 0");
	            System.out.println("The product of the values is 0");
	            return;
	        }
	       int r = arr[num/2];
	       if(r%2==0) {
	    	   int res1 = add(arr,0,num/2);
	    	   int res2 = mul(arr,(num/2)+1,num);
	    	   System.out.println("The sum of the values is "+res1);
	    	   System.out.println("The product of the values is "+res2);
	       }else {
	    	   int res3 = mul(arr,0,num/2);
	    	   int res4 = add(arr,(num/2)+1,num);
	    	   System.out.println("The sum of the values is "+res4);
	    	   System.out.println("The product of the values is "+res3);
	    	   
	       }
	       
	       sc.close();
	}
}
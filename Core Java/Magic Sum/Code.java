import java.util.Scanner;

public class Code{
	
	public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i= 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
	
	public static boolean checkPrimeSum(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(isPrime(i)) {
				
				sum +=i;
			    if(sum==n) {
				   return true;
			   }
			}
		}
		return false;
	}
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the array size");
       int num1 = sc.nextInt();
       if(num1<1|| num1>5){
           System.out.println(num1+" is an invalid array size");
           return;
       }
       int[] arr1 = new int[num1];
       System.out.println("Enter the numbers");
       for(int i=0;i<num1;i++){
           arr1[i]=sc.nextInt();
           if(arr1[i]<=0 || arr1[i]>=100){
               System.out.println(arr1[i]+" is an invalid input");
               return;
           }
       }
       boolean f = false;
       
       for(int i=0;i<num1;i++) {
    	   
    	      if(checkPrimeSum(arr1[i])) {
    	    	  
    	    	  if(!f) {
    	    		  System.out.println("The sum of prime numbers is");
    	     }
    	    System.out.println(arr1[i]);
       		f = true;
    	      }
       
       }
       if(!f) {
    	   System.out.println("The "+num1+" numbers are not sum of prime numbers");
       }
        //Fill the code here
        sc.close();
    }
}
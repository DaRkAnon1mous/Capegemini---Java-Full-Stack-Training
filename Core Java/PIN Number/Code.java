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
	
	public static boolean isEvenOdd(int n) {
		if(n%2==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isComp(int n) {
		if(n<=1) {
			return false;
		}
		return !isPrime(n);
	}
	
	public static boolean checkRes(int n) {
		   int n1 = n/1000;
	 	   int n2 = (n/100)%10;
	 	   int n3 = (n/10)%10;
	 	   int n4 = n%10;
	 	   int count=0;
	 	  if(!isEvenOdd(n1)) {
   		   count+=1;
   	   }
	 	  if(isEvenOdd(n2)) {
	 		  count+=1;
	 	  }
	 	  if(isPrime(n3)) {
	 		  count+=1;
	 	  }
	 	  if(isComp(n4)) {
	 		  count+=1;
	 	  }
	 	   
	 	  if(count==4) {
	 		  return true;
	 	  }
	 	  return false;
	}
	
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the total number of PIN numbers");
       int num1 = sc.nextInt();
       if(num1<1){
           System.out.println(num1+" is an invalid number");
           return;
       }
       int[] arr1 = new int[num1];
       System.out.println("Enter the PIN numbers");
       for(int i=0;i<num1;i++){
           arr1[i]=sc.nextInt();
           if(arr1[i]<1000 || arr1[i]>9999){
               System.out.println(arr1[i]+" is an invalid PIN number");
               return;
           }
       }
       boolean f = false;
       for(int i = 0; i<num1;i++) {
    	   if(checkRes(arr1[i])){
    		   if(!f) {
    			   System.out.println("Valid PIN numbers are");
    		   }
    		   System.out.println(arr1[i]);
    		   f=true;
    	   }
       }
       if(!f) {
    	   System.out.println("All these "+num1+" numbers are not a valid PIN number");
       }
        sc.close();
    }
}
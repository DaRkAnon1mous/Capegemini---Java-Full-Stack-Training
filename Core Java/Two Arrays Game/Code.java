import java.util.Scanner;

public class UserInterface{
	
	
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size for the first array");
       int num1 = sc.nextInt();
       if(num1<=0){
           System.out.println(num1+" is an invalid array size");
           return;
       }
       int[] arr1 = new int[num1];
       System.out.println("Enter the elements for the first array");
       for(int i=0;i<num1;i++){
           arr1[i]=sc.nextInt();
       }
       System.out.println("Enter the size for the second array");
       int num2 = sc.nextInt();
       if(num2<1){
           System.out.println(num2+" is an invalid array size");
           return;
       }
       
       int[] arr2 = new int[num2];
       System.out.println("Enter the elements for the second array");
       for(int i=0;i<num2;i++){
           arr2[i]=sc.nextInt();
       }
       if(num1!=num2) {
    	   System.out.println("Both array size are not the same");
    	   return;
       }
       int[] arr3 = new int[num1];
       arr3[0]=arr1[0]+arr2[0];
       for(int i=1;i<num1;i++) {
    	   if(i%2==0) {
    		   arr3[i]=arr1[i]+arr2[i];
    	   }else {
    		   arr3[i]=arr1[i]-arr2[i];
    	   }
       }
       System.out.println("The elements of the third array");
       for(int i=0;i<num1;i++){
           System.out.println(arr3[i]);
           }
       
        //Fill the code here
       sc.close();
    }
}
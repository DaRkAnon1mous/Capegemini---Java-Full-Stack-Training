import java.util.Scanner;

public class Main{
    public static boolean checkPrime(int n){
        if(n<2){
            return false;
        // }else if(n==2){
        //     return true;
        }else{
            
        
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of chances");
       int num1 = sc.nextInt();
       if(num1<1||num1>5){
       System.out.println("Your chance "+num1+" is out of range(1-5)");
       return;
       }
       int[] arr = new int[num1*2];
       System.out.println("Enter the numbers");
       int sum=0;
       for(int i =0;i<num1*2;i++){
           arr[i]=sc.nextInt();
           if(arr[i]<=0||arr[i]>=10){
               System.out.println(arr[i]+" is an invalid number");
               return;
           }
           sum+=arr[i];
       }
       if(checkPrime(sum)){
            System.out.println("The sum "+sum+" is a prime number.You won the game");
       }else{
           System.out.println("The sum "+sum+" is not a prime number.Better luck next time");
       }
       sc.close();
        //Fill the code here
        
    }
}
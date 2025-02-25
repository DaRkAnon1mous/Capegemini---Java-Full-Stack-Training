import java.util.Scanner;

public class Code {
    public static int doubleDigit(int n){
            return n%10;
    }
    
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
    
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
    //Fill the code here
    System.out.println("Enter the size of first array");
    int num1 = sc.nextInt();
    if(num1<=0){
        System.out.println(num1+" is an invalid array size");
        return;
    }
    int[] arr1 = new int[num1];
    System.out.println("Enter the array elements");
    for(int i=0;i<num1;i++){
        arr1[i]=sc.nextInt();
        if(arr1[i]<0){
            System.out.println(arr1[i]+" is an invalid input");
            return;
        }
    }
    System.out.println("Enter the size of second array");
    int num2 = sc.nextInt();
    if(num2<=0){
        System.out.println(num2+" is an invalid array size");
        return;
    }
    if(num1!=num2){
        System.out.println("Both array size is different");
        return;
    }
    int[] arr2 = new int[num2];
    System.out.println("Enter the array elements");
    for(int i=0;i<num2;i++){
        arr2[i]=sc.nextInt();
        if(arr2[i]<0){
            System.out.println(arr2[i]+" is an invalid input");
            return;
        }
    }
    int[] arr3=new int[num1];
    for(int i=0;i<num1;i++){
        arr3[i]=arr1[i]+arr2[i];

    }
    int sum = 0;
    for(int i=0;i<num2;i++){
        if(arr3[i]>=10){
            sum+=doubleDigit(arr3[i]);
        }else{
            sum+=arr3[i];
        }
    }
    if(isPrime(sum)){
        System.out.println(sum+" is a prime number");
    }else{
        System.out.println(sum+" is not a prime number");
    }
    
	}


}
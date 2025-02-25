import java.util.Scanner;


public class FindSubset {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first array size");
        int num1 = sc.nextInt();
        if(num1<=0){
            System.out.println(num1+" is an invalid array size");
            return;
        }
        int[] arr1 = new int[num1];
        System.out.println("Enter the numbers");
        for(int i =0;i<num1;i++){
            arr1[i]=sc.nextInt();
        }

        System.out.println("Enter the second array size");
        int num2 = sc.nextInt();
        if(num2<=0){
            System.out.println(num2+" is an invalid array size");
            return;
        }
        int[] arr2 = new int[num2];
        System.out.println("Enter the numbers");
        for(int i=0;i<num1;i++){
            arr2[i]=sc.nextInt();
        }
        if(num1<num2){
            System.out.println(num2+" is an invalid size as it is greater than first array size "+num1);
            return;
        }
        int count =0;
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                if(arr1[i]==arr2[j]){
                    count+=1;
                }
            }
            
        }
        if(count==num2){
            System.out.println(" Arra2 of size "+num2+" is a subset of array1");
        }else{
            System.out.println(" Arra2 of size "+num2+" is not a subset of array1");
        }

    }
}

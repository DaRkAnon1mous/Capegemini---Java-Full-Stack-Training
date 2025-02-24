import java.util.Scanner;
import java.util.Arrays;

public class SumofMinMax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int num = sc.nextInt();
        if(num<=0){
            System.out.println(num+" is an invalid array size");
            return;
        }else if(num%2!=0){
            System.out.println(num+" is an odd number");
            return;
        }else{
        int[] arr = new int[num];
        System.out.println("Enter the numbers");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int maxsum=0;
        for(int j=0;j<num/2;j++){
            int sum = arr[j]+arr[num-1-j];
            maxsum = Math.max(maxsum,sum);
        }
        System.out.println("Max numbers"+maxsum);
        sc.close();
    }

}
}

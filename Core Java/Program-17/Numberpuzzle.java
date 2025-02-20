import java.util.Scanner;


public class Numberpuzzle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int reverse = Reverseno(num);
        if(num<10 || num>99){
            System.out.println("Invalid number");
            return;
        }
        if(num>50){
            int res1 = Calculate(num);
            System.out.println(res1);
        }else{
            int res2 = Calculate(reverse);
            System.out.println(res2);
        }
    }
    public static int Calculate(int m){
        int h = 0;
        while(m>0){
            int d = m%10;
            h = d-h;
            m = m/10;
            }
            return h;
}
public static int Reverseno(int n){
    int rev = 0;
        while(n>0){
            int d = n%10;
            rev = rev*10+d;
            n = n/10;
            }
            return rev;
}
}

import java.util.Scanner;

public class Swap2no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swapping " + "a = "+a+" b = "+b);
        int temp = a;
        a= b;
        b= temp;
        System.out.println("After swapping " + "a = "+a+" b = "+b);


        System.out.println("Bitwise swapping " + "a = "+a+" b = "+b);
        a = a^b;
        b = a^b;
        a=a^b;
        System.out.println("After swapping " + "a = "+a+" b = "+b);
        sc.close();
    }
    
}

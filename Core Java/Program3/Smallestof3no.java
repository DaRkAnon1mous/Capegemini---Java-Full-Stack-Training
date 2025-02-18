
import java.util.Scanner;
public class Smallestof3no {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a == b && b == c) {
            System.out.print("All numbers are equal");
        } 
        else if(a <= b && a <= c) {
            System.out.print("Smallest number is: " + a);
        } 
        else if(b <= a && b <= c) {
            System.out.print("Smallest number is: " + b);
        } 
        else {
            System.out.print("Smallest number is: " + c);
        }
        sc.close();
}
        
    
}
    


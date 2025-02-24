import java.util.Scanner;


public class FindSubstring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String s = sc.nextLine();
        System.out.println("Enter the two indices");
        int a= sc.nextInt();
        if(a>s.length()){
            System.out.println(a+" is greater than word length");
            return;
        }
        int b =sc.nextInt();
        if(b>s.length()){
            System.out.println(b+" is greater than word length");
            return;
        }
        if(a>b){
            System.out.println(" Index2 should be greater than Index1");
            return;
        }
        System.out.println(s.substring(a, b));
   }
}

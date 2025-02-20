/*
 * Desciption
 * Kevin is trying to solve a number puzzle. If the number is greater than fifty, he wants the difference between the digits of the number; otherwise, if the number is less than or equal to fifty, he wants to reverse the number and find the difference in digits. Help Kevin to solve the problem using a Java program.

Requirements:

The input number should be a two digit integer, else display "Invalid number".

Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program.

Sample Input/Output 1:

Enter the number

56

-1

Explanation:

56 is greater than 50, so subtract 5 - 6 = -1



Sample Input/Output 2:

Enter the number

48

4

Explanation:

48 is less than 50, so reverse 48 to 84 then subtract 8 - 4 = 4



Sample Input/Output 3:

Enter the number

9

Invalid number
 * 
 * 
 */



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

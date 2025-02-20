/*
 *        Description
 * 
 * 
 * Mr. Ben gives an assignment to his students. He gives a number and the students need to add ten numbers to it and display the sum. The output should be displayed as "The sum of ten numbers is <sum>". If the entered number is negative, then the output should be displayed as "<number> is a negative number".

Help the students to complete the assignment using the Java program.



Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided
Please do not use System.exit(0) to terminate the program.

Sample Input/Output 1:

Enter the number

1

The sum of ten numbers is 55

Explanation:

Number : 1

Sum = 1+2+3+4+5+6+7+8+9+10 = 55


Sample Input/Output 2:

Enter the number

-2

-2 is a negative number


 */

import java.util.Scanner;

public class SumofTen {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if(num<0){
            System.out.println(num+" is a negative number");
            return;
        }
        int i =10,sum=0;
        while(i!=0){
            sum+=num;
            num+=1;
            i--;
        }
        System.out.println("The sum of ten numbers is "+sum);
        
    }
}
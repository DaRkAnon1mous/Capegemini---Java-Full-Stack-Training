/*
 *                 -----Description
Alex, Nikil, and Sam are three friends playing the Ludo game. After completing one round, they note their points, and at the end of the day they calculate the points. The one who scores the highest will be considered the winner. Write a Java program to find out who scores the highest points and display the output.

Requirements:

The points should be between 0 and 50 (both inclusive), else print "<points> is an invalid number' and terminate the program.
If any of two persons points are equal or all are having equal points, then print "The game is a tie".
After finding the winner, print "<Name> scores <Points> points and wins the game".
Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program.

Sample Input/Output 1:

Enter Alex points

10

Enter Nikil points

12

Enter Sam points

25

Sam scored 25 points and won the game



Sample Input/Output 2

Enter Alex points

10

Enter Nikil points

-5

-5 is an invalid number



Sample Input/Output 3

Enter Alex points

60

60 is an invalid number




Sample Input/Output 4


Enter Alex points

40

Enter Nikil points

32

Enter Sam points

40

The game is a tie
*/




import java.util.Scanner;

public class Ludoking {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Alex points");
        int num1 = sc.nextInt();
        if(num1<0 && num1>50){
            System.out.println(num1+" is an invalid number");
            return;
        }
        System.out.println("Enter Nikil points");
        int num2 = sc.nextInt();
        if(num2<0 && num2>50){
            System.out.println(num2+" is an invalid number");
            return;
        }
        System.out.println("Enter Sam points");
        int num3 = sc.nextInt();
        if(num3<0 && num3>50){
            System.out.println(num3+" is an invalid number");
            return;
        }
        if(num1==num2 || num2==num3 || num1==num3){
            System.out.println("The game is a tie");
            return;
        }
        if(num1>num2 && num1>num3){
            System.out.println("Alex scored "+num1+" points and won the game");

        }else if(num2>num1 && num2>num3){
            System.out.println("Nikil scored "+num2+" points and won the game");

        }else{
            System.out.println("Sam scored "+num3+" points and won the game");

        }





    }   
}

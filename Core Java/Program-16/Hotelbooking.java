/*
 *     Description
 * 
 * SKY hotels decide to automate their room booking as the manual booking is very tedious. As you are their software consultant, help them to automate their booking and calculate the amount for booking each room. Automate the hotel booking using the Java program.

Requirements:

The number of rooms should be greater than zero, else print "Please enter a valid number" until the valid room number is given.
Assume the rent for 1 room is Rs.500.
Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program.

Sample Input/Output 1:

Enter the name

Akash

Enter the number of rooms you needed

2

Enter the phone number

9876543210

Pay Rs. 1000 for booking

Your booking has been confirmed

 

Sample Input/Output 2:

Enter the name

Carlo

Enter the number of rooms you needed

-1

Please enter a valid number

0

Please enter a valid number

1

Enter the phone number

9977553311

Pay Rs. 500 for booking

Your booking has been confirmed
 */



import java.util.Scanner;

public class Hotelbooking {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String s = sc.nextLine();

        System.out.println("Enter the number");
        int num;
        while(true){
            try{
            num = sc.nextInt();
            if (num>0){
                break;
            }else{
                System.out.println("Please enter a valid number");
            }
        } catch(Exception e){
                // System.out.println("Please enter a valid number");
                sc.next();
            }
        }
        System.out.println("Enter the phone number");
        long p = sc.nextLong();
        System.out.println("Pay Rs. "+(num*500)+" for your booking");
        System.out.println("Your booking has been confirmed");
        
        

    }
}
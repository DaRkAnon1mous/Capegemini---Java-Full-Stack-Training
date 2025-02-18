/*
Question :
 * Sky Airlines company wants to print a message based on the inputs given by the customers. Help them by writing a java application to get the customer name, source and destination and print the message in following format.

Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program.


Sample Input:

Enter name

Jack

Enter source

Dubai 

Enter destination

Chicago

Sample Output:

Dear Jack, welcome onboard with service from Dubai to Chicago. Thankyou for choosing Sky Airlines. Enjoy your flight.
 */





//package Core Java.Program2;
import java.util.Scanner;
public class Skyairlines {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name ");
        String s1 = sc.nextLine();

        System.out.print("Enter source ");
        String s2 = sc.nextLine();

        System.out.print("Enter destination ");
        String s3 = sc.nextLine();

        // Printing the output
        System.out.println("Dear "+s1+", welcome onboard with service from "+s2+" to"+s3+". Thankyou for choosing Sky Airlines. Enjoy your flight.");

    }
    
}

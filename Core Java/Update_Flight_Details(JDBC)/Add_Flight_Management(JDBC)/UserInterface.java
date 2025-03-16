import java.util.Scanner;
public class UserInterface{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Fill the Code
        System.out.println("Enter flight id");
        int s1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter flight fare");
        double s2 = sc.nextDouble();
        FlightManagementSystem fms = new FlightManagementSystem();
        if(fms.updateFlightFare(s1,s2)){
            System.out.println("Flight Fare updated successfully");
        }else{
            System.out.println("Flight Fare not updated. Check for the ID");
        }


    }
}
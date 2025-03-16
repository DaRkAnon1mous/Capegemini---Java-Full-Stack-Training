import java.util.*;
public class UserInterface{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Fill the code here
        System.out.println("Enter the flight id");
        int a = sc.nextInt();
        sc.nextLine();
        FlightManagementSystem fms = new FlightManagementSystem();
        if(fms.deleteFlight(a)){
            System.out.println("Flight details deleted successfully");
        }else{
            System.out.println("Flight not deleted. Check for the ID");
        }
    }
}
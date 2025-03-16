import java.util.Scanner;
public class UserInterface{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Fill the Code
        System.out.println("Enter flight Id");
        int f1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter source");
        String f2 = sc.nextLine();
        System.out.println("Enter destination");
        String f3 = sc.nextLine();
        System.out.println("Enter noOfSeats");
        int f4 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the fare");
        double f5 = sc.nextDouble();
        sc.nextLine();
        Flight f = new Flight(f1,f2,f3,f4,f5);
        FlightManagementSystem fms = new FlightManagementSystem();
        if(fms.addFlight(f)){
            System.out.println("Flight details added successfully");
        }else{
             System.out.println("Flight details not added successfully");
}

    }
}
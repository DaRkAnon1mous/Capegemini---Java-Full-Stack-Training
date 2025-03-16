import java.util.*;
public class UserInterface{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Fill the Code
        System.out.println("Enter the source");
        String s1 = sc.nextLine();
        System.out.println("Enter the destination");
        String s2 = sc.nextLine();
        FlightManagementSystem fms = new FlightManagementSystem();
        ArrayList<Flight> flights = fms.viewFlightsBySourceAndDestination(s1,s2);
        
        if(flights.isEmpty()){
            System.out.println("No flights available for the given source and destination");
        }else{
            for(Flight flight:flights){
                System.out.println("Flight ID : "+flight.getFlightId());
                System.out.println("Source : "+flight.getSource());
                System.out.println("Destination : "+flight.getDestination());
                System.out.println("No of seats : "+flight.getNoOfSeats());
                System.out.println("Flight Fare : "+flight.getFlightFare());
                System.out.println();
            }
        }


    }
}
import java.util.*;
import java.sql.*;
public class FlightManagementSystem
{
    // Fill the code
    public ArrayList<Flight> viewFlightsBySourceAndDestination(String source,String destination){
        
        ArrayList<Flight> flights = new ArrayList<>();
        PreparedStatement pr = null;
        Connection con = null;
        ResultSet stm = null;
        try{
            con = DB.getConnection();
            String query = "Select * from flight where source = ? AND destination =?";
            pr=con.prepareStatement(query);
            pr.setString(1,source);
            pr.setString(2,destination);
            stm = pr.executeQuery();
            while(stm.next()){
                int flightId = stm.getInt("flightId");
                String flightSource = stm.getString("source");
                String flightDestination = stm.getString("destination");
                int noOfSeats = stm.getInt("noofseats");
                double flightFare = stm.getDouble("flightfare");
                
                flights.add( new Flight (flightId,source,destination,noOfSeats,flightFare));
               
            }
    }catch(SQLException e){
        e.printStackTrace();
    }catch(ClassNotFoundException e1){
        e1.printStackTrace();
    }finally{
        try{
            if(stm!=null) 
            stm.close();
            if(pr!=null)
               pr.close();
            if(con!=null)
               con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    return flights;
    }
}
import java.sql.*;

public class FlightManagementSystem
{
    // Fill the code
    public boolean addFlight(Flight flightObj){
        String query = "INSERT INTO flight (flightId,source,destination,noofseats,flightfare) VALUES(?,?,?,?,?)";
        try(Connection con = DB.getConnection(); 
             PreparedStatement pr = con.prepareStatement(query)){
                 if(String.valueOf(flightObj.getFlightFare()).length()>8||flightObj.getFlightFare()>999999.99){
                     return false;
                 }
            if(con!=null){
                pr.setInt(1,flightObj.getFlightId());
                pr.setString(2,flightObj.getSource());
                pr.setString(3,flightObj.getDestination());
                pr.setInt(4,flightObj.getNoOfSeats());
                pr.setDouble(5,flightObj.getFlightFare());
                pr.execute();
                return true;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e1){
            e1.printStackTrace();
        }
        return false;
    }
    
}

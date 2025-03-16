import java.sql.*;
import java.util.*;
public class FlightManagementSystem
{
   //Fill the code here
   public boolean updateFlightFare(int flightId,double flightFare){
       String query = "UPDATE flight set flightfare = ? where flightId = ?";
       try(Connection con = DB.getConnection();
           PreparedStatement pr = con.prepareStatement(query)){
              pr.setDouble(1,flightFare);
              pr.setInt(2,flightId);
              int rows = pr.executeUpdate();
              
              return rows>0;
           }catch(SQLException e){
               e.printStackTrace();
           }catch(ClassNotFoundException e1){
               e1.printStackTrace();
           }
           return false;
   }
}
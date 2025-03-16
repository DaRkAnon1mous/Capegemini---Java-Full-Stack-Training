import java.sql.*;
public class FlightManagementSystem
{
   //Fill the code here
   public boolean deleteFlight(int flightId){
       String query = "DELETE FROM flight where flightId =?";
       try(Connection con = DB.getConnection();
           PreparedStatement pr = con.prepareStatement(query)){
               pr.setInt(1,flightId);
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
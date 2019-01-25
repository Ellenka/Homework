package academy.mate.homework15;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseAccess {
public static void main(String[] args) {
    
    try {
      // The newInstance() call is a work around for some
      // broken Java implementations

      Class.forName("com.mysql.jdbc.Driver").newInstance();
  } catch (Exception ex) {
      // handle the error
  }
    Connection conn = null;
   
    try {
        conn =
           DriverManager.getConnection("jdbc:mysql://s3.thehost.ua/itea2?" +
                                       "user=helen&password=123456");

        // Do something with the Connection

    } catch (SQLException ex) {
        // handle any errors
        System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
    }
    System.out.println("Connection ok");
    Statement st = null;
    try {
      st = conn.createStatement();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    String sql = "SHOW TABLES";
    String sql1 = "DESCRIBE ss";
    String sql2 = "INSERT INTO ss  (animal, name, type, age) VALUES ('Homo', 'OlenaDobrovinska', 'Homo sapiens', 33)";
    String sql3 = "SELECT*FROM ss";
    //String sql4 = "DELETE FROM ss WHERE id = 6";
    try {
      ResultSet rs = st.executeQuery(sql);
      while (rs.next()){
        System.out.println(rs.getString(1));
      }
      System.out.println("---------------------------------");
      
      rs = st.executeQuery(sql1);
      while (rs.next()){
        System.out.println(rs.getString(1) + " "+rs.getString(2)+" "+rs.getString(3)+" "+
      rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));
      }
      System.out.println("---------------------------------");
      
      //st.executeUpdate(sql2);
      rs = st.executeQuery(sql3);
      while (rs.next()){
        System.out.println(rs.getString(1) + " "+rs.getString(2)+" "+rs.getString(3)+" "+
      rs.getString(4)+" "+rs.getString(5));
      }
      rs.close();
    }
     catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    try {
      st.close();
      conn.close();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
 
    }
    

}

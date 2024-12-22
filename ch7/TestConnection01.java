// https://dev.mysql.com/downloads/connector/j/
import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection01 {
    public static void main(String args[]) {
        try {
            // Step 1: Load the Driver
            Class.forName("com.mysql.cj.jdbc.Driver"); // MySQL 8.0 and above
            
            // Step 2: Get the connection by passing the URL
            String url = "jdbc:mysql://localhost:3306/mydb";
            
            Connection con = DriverManager.getConnection(url, "root", "root");
            System.out.println("Connection established: " + con);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

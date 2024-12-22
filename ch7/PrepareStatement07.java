import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepareStatement07 {
    static Connection con = null;
    static PreparedStatement pstmt = null;

    public static void main(String[] args) {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Connect to the database
            String url = "jdbc:mysql://localhost:3306/mydb";
            con = DriverManager.getConnection(url, "root", "root");

            // SQL query with placeholders
            String query = "INSERT INTO CUSTOMERS values (?,?,?,?,?,?,?,?)";
            pstmt = con.prepareStatement(query);

            // Set the values for placeholders
            pstmt.setString(1, "Harry");
            pstmt.setString(2, "B");
            pstmt.setString(3, "Porter");
            pstmt.setInt(4, 20);
            pstmt.setInt(5, 123);
            pstmt.setString(6, "Kathmandu");
            pstmt.setString(7, "Bagmati");
            pstmt.setString(8, "Nepal");

            // Execute the insert query
            pstmt.executeUpdate();
            System.out.println("Record inserted successfully!");

            pstmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

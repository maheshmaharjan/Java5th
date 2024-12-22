import java.sql.*;

public class ReadingData05 {

    public static void main(String args[]) {
	// SQL query to select the first name from CUSTOMERS table
        String sql = "SELECT firstname FROM CUSTOMERS";
        try {
            readData(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void readData(String sql) throws Exception {
        // Load the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish connection to the database
        String url = "jdbc:mysql://localhost:3306/mydb";

        try (Connection con = DriverManager.getConnection(url, "root", "root");
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // Loop through the ResultSet to print first names
            while (rs.next()) {
                String firstName = rs.getString("FirstName");
                System.out.println("Firstname: " + firstName);
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}

// Try-with-resources: The connection (Connection), statement (Statement), and result set (ResultSet) are enclosed in a try-with-resources block, which ensures they are automatically closed when no longer needed.


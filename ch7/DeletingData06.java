import java.sql.*;
import javax.swing.JOptionPane;

public class DeletingData06 {

    static Connection con = null;
    static Statement stmt = null;

    public static void main(String args[]) {
        try {
            // SQL statement to delete the customer record
            String sql = "DELETE FROM customers WHERE firstname = 'John'";
            // Call the method to execute the delete query
            DeleteData(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void DeleteData(String sql) throws Exception {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            String url = "jdbc:mysql://localhost:3306/MyDB";
            con = DriverManager.getConnection(url, "root", "root");

            if (con != null) {
                stmt = con.createStatement();  // Create the statement

                int result = stmt.executeUpdate(sql); // Execute the delete query

                // Check if the delete operation was successful
                if (result != 0) {
                    JOptionPane.showMessageDialog(null, "Record deleted successfully.");
                } else {
                    JOptionPane.showMessageDialog(null, "Record not found.");
                }
            } else {
                System.out.println("Unable to get the connection");
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        } finally {
            stmt.close();
            con.close();
        }
    }
}

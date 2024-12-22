import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable02 {
    public static void main(String args[]) throws Exception {
        String sql = "CREATE TABLE CUSTOMERS(FIRSTNAME VARCHAR(50), MIDDLENAME VARCHAR(20), LASTNAME VARCHAR(50), AGE NUMERIC(2), SSN NUMERIC(10), CITY VARCHAR(32), STATE VARCHAR(20), COUNTRY VARCHAR(40))";

        createTable(sql);
    }
    
    private static void createTable(String sql) throws Exception { 
        // Step 1: Load the MySQL driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Step 2: Get the connection using the JDBC URL
        String url = "jdbc:mysql://localhost:3306/mydb";
        Connection con = DriverManager.getConnection(url, "root", "root");
        
        if (con != null) {
            // Step 3: Create a statement from the connection
            Statement stmt = con.createStatement();
            
            // Step 4: Execute the statement with the SQL query
            int result = stmt.executeUpdate(sql);
            if (result != -1) {
                System.out.println("Table created successfully");
            } else {
                System.out.println("Table creation failed. Please check the SQL syntax.");
            }
            
            // Step 5: Close the statement and connection
            stmt.close();
            con.close();
        } else {
            System.out.println("Unable to establish a connection.");
        }
    }
}


import java.sql.*;

public class InsertingData03 {
    public static void main(String args[]) throws Exception {
        // Define the values for the fields
        String firstName = "Bhawana";
        String middleName = "A";
        String lastName = "Doe";
        int age = 30;
        int ssn = 123456789;
        String city = "Kathmandu";
        String state = "Bagmati";
        String country = "Nepal";

        // SQL Query for inserting data into CUSTOMERS table
        String sql = "INSERT INTO CUSTOMERS VALUES('" 
                    + firstName + "', '" + middleName + "', '" 
                    + lastName + "', " + age + ", " + ssn + ", '" 
                    + city + "', '" + state + "', '" + country + "')";

        // Pass the SQL query to the method
        insertCustomer(sql);
    }

    // Method to insert customer into database
    private static void insertCustomer(String sql) throws Exception {
        // Load the MySQL driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish connection to the database
        String url = "jdbc:mysql://localhost:3306/mydb"; // Update your DB details here
        Connection con = DriverManager.getConnection(url, "root", "root"); // Update your username and password

        if (con != null) {
            Statement stmt = con.createStatement(); // Create statement

            int result = stmt.executeUpdate(sql); // Execute the SQL query

            // Check if the insertion was successful
            if (result != -1) {
                System.out.println("Inserted " + result + " record(s) successfully");
            } else {
                System.out.println("Unable to insert record. Please check your SQL syntax.");
            }

            // Close statement and connection
            stmt.close();
            con.close();
        } else {
            System.out.println("Unable to establish a connection.");
        }
    }
}

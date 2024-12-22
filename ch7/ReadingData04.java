import java.sql.*;

public class ReadingData04 {
    public static void main(String args[]) throws Exception {
	// SQL query to select all records from CUSTOMERS table
        String sql = "SELECT * FROM CUSTOMERS";

        readData(sql);
    }

    private static void readData(String sql) throws Exception {
        // Load MySQL driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish connection to the database
        String url = "jdbc:mysql://localhost:3306/mydb"; // Update with your database info
        Connection con = DriverManager.getConnection(url, "root", "root"); // Update with your username and password

        if (con != null) {
            Statement stmt = con.createStatement(); // Create a statement from the connection

            ResultSet rs = stmt.executeQuery(sql); // Execute the SQL query and store the result in ResultSet

            // Iterate over all the returned records
            while (rs.next()) {
                // Reading data using column index
                String firstName = rs.getString(1);
                String middleName = rs.getString(2);
                String lastName = rs.getString(3);
                int age = rs.getInt(4);
                int ssn = rs.getInt(5);
                String city = rs.getString(6);
                String state = rs.getString(7);
                String country = rs.getString(8);

                // Print the data retrieved from the database
                System.out.println(firstName + " ," + middleName + " ," + lastName + " ," 
                                    + age + " ," + ssn + " ," + city + " ," + state + " ," + country);
            }

            // Close ResultSet, Statement, and Connection to free resources
            rs.close();
            stmt.close();
            con.close();
        } else {
            System.out.println("Unable to establish a connection to the database.");
        }
    }
}

// The SELECT query is executed using the executeQuery() method of the Statement object. This returns a ResultSet.

// Common ResultSet Get Methods:
	// public String getString(int columnIndex): for VARCHAR and other string-based columns.
	// public int getInt(int columnIndex): for numeric columns like INT or NUMERIC.
	// public Date getDate(int columnIndex): for DATE columns.

//Enhancements:
	// Column Names vs Column Numbers: You can improve readability by using column names instead of column numbers. For example:
		// String firstName = rs.getString("FirstName");
		// String age = rs.getInt("Age");

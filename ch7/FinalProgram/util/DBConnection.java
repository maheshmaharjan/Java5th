// Create Users Table
// CREATE TABLE users (
//     SSN BIGINT PRIMARY KEY,
//     NAME VARCHAR(100),
//     AGE INT
// );


package FinalProgram.util;

import java.sql.*;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            throw new RuntimeException("Failed to establish connection: " + e.getMessage());
        }
    }
}



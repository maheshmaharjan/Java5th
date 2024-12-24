package FinalProgram.dao.impl;

import FinalProgram.dao.UserDAO;
import FinalProgram.model.User;
import FinalProgram.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {

    @Override
    public void createUser(User User) {
        String sql = "INSERT INTO Users (SSN, NAME, AGE) VALUES (?, ?, ?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setLong(1, User.getSsn());
            pstmt.setString(2, User.getName());
            pstmt.setInt(3, User.getAge());
            pstmt.executeUpdate();
            System.out.println("User created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User getUserBySSN(long ssn) {
        String sql = "SELECT * FROM Users WHERE SSN = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setLong(1, ssn);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                User User = new User();
                User.setSsn(rs.getLong("SSN"));
                User.setName(rs.getString("NAME"));
                User.setAge(rs.getInt("AGE"));
                return User;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> Users = new ArrayList<>();
        String sql = "SELECT * FROM Users";
        try (Connection con = DBConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                User User = new User();
                User.setSsn(rs.getLong("SSN"));
                User.setName(rs.getString("NAME"));
                User.setAge(rs.getInt("AGE"));
                Users.add(User);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Users;
    }

    @Override
    public void updateUser(User User) {
        String sql = "UPDATE Users SET NAME = ?, AGE = ? WHERE SSN = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, User.getName());
            pstmt.setInt(2, User.getAge());
            pstmt.setLong(3, User.getSsn());
            pstmt.executeUpdate();
            System.out.println("User updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteUser(long ssn) {
        String sql = "DELETE FROM UserS WHERE SSN = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setLong(1, ssn);
            pstmt.executeUpdate();
            System.out.println("User deleted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

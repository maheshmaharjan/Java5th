package FinalProgram;

import FinalProgram.dao.UserDAO;
import FinalProgram.dao.impl.UserDAOImpl;
import FinalProgram.model.User;

import java.util.List;

public class MainFile {
    public static void main(String[] args) {
        UserDAO UserDAO = new UserDAOImpl();

        // Create a User
        User User = new User();
        User.setSsn(1234567890L);
        User.setName("John Doe");
        User.setAge(30);
        UserDAO.createUser(User);

        // Get a User by SSN
        User retrievedUser = UserDAO.getUserBySSN(1234567890L);
        if (retrievedUser != null) {
            System.out.println("Retrieved User: " + retrievedUser.getName() + ", Age: " + retrievedUser.getAge());
        }

        // Get all Users
        List<User> Users = UserDAO.getAllUsers();
        Users.forEach(u -> System.out.println("User: " + u.getName() + ", Age: " + u.getAge()));

        // Update a User
        User.setName("Jane Doe");
        User.setAge(35);
        UserDAO.updateUser(User);

        // Delete a User
        UserDAO.deleteUser(1234567890L);
    }
}


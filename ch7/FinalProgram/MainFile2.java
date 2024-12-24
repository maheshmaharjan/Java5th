package FinalProgram;

import FinalProgram.dao.UserDAO;
import FinalProgram.dao.impl.UserDAOImpl;
import FinalProgram.model.User;

import java.util.List;
import java.util.Scanner;

public class MainFile2 {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAOImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== User Management System =====");
            System.out.println("1. Create User");
            System.out.println("2. Get User by SSN");
            System.out.println("3. Get All Users");
            System.out.println("4. Update User");
            System.out.println("5. Delete User");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    User newUser = new User();

                    System.out.print("Enter SSN: ");
                    newUser.setSsn(scanner.nextLong());
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter Name: ");
                    newUser.setName(scanner.nextLine());

                    System.out.print("Enter Age: ");
                    newUser.setAge(scanner.nextInt());

                    userDAO.createUser(newUser);
                    break;

                case 2:
                    System.out.print("Enter SSN to retrieve: ");
                    long ssn = scanner.nextLong();

                    User retrievedUser = userDAO.getUserBySSN(ssn);
                    if (retrievedUser != null) {
                        System.out.println("Retrieved User: " + retrievedUser.getName() + ", Age: " + retrievedUser.getAge());
                    } else {
                        System.out.println("No user found with SSN " + ssn);
                    }
                    break;

                case 3:
                    List<User> users = userDAO.getAllUsers();
                    
                    System.out.println("\nAll Users:");
                    for (int i = 0; i < users.size(); i++) {
                        User user = users.get(i);
                        System.out.println("SSN: " + user.getSsn() + ", Name: " + user.getName() + ", Age: " + user.getAge());
                    }
                    break;

                case 4:
                    User userToUpdate = new User();
                    System.out.print("Enter SSN to update: ");
                    userToUpdate.setSsn(scanner.nextLong());
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter new Name: ");
                    userToUpdate.setName(scanner.nextLine());

                    System.out.print("Enter new Age: ");
                    userToUpdate.setAge(scanner.nextInt());

                    userDAO.updateUser(userToUpdate);
                    break;

                case 5:
                    System.out.print("Enter SSN to delete: ");
                    long ssnToDelete = scanner.nextLong();
                    userDAO.deleteUser(ssnToDelete);
                    break;

                case 6:
                    System.out.println("Exiting the application. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

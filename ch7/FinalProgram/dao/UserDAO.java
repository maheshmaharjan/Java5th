package FinalProgram.dao;

import FinalProgram.model.User;
import java.util.List;

public interface UserDAO {
    void createUser(User user);
    User getUserBySSN(long ssn);
    List<User> getAllUsers();
    void updateUser(User user);
    void deleteUser(long ssn);
}

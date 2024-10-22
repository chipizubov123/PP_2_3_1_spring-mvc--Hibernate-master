package web.DAO;

import web.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDAO {

    void save(User user);
    List<User> findAll();
    Optional<User> findById(Long id);
    void updateUser(User user);
    void deleteById(Long id);
}

package io.zenbydef.usertracker.service;

import io.zenbydef.usertracker.entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> getUsers();

    void saveUser(User user);

    User getUserById(Long id);

    void deleteUser(Long id);

//    List<User> searchUsers(String theSearchName);

    User findUserByName(String userName);
}

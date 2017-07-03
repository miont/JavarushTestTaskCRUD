package org.jr.internship.dao;

import org.jr.internship.model.User;

import java.util.List;

/**
 * Created by clement on 26.06.17.
 */
public interface UserDAO {

    void addUser(User user);

    User updateUser(User user);

    void deleteUser(Integer userId);

    List<User> getAllUsers();

    User getUser(int userId);

    List<User> selectUsersByName(String userName);

}

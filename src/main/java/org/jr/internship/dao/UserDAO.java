package org.jr.internship.dao;

import org.jr.internship.model.User;

import java.util.List;

/**
 * Доступ к базе данных
 */
public interface UserDAO {

    void addUser(User user);

    User updateUser(User user);

    void deleteUser(Integer userId);

    List<User> getAllUsers();

    User getUser(int userId);

    List<User> selectUsersByName(String userName);

}

package org.jr.internship.service;

import org.jr.internship.model.User;

import java.util.List;

/**
 * Сервис для доступа к пользователям
 */
public interface UserService {

    void addUser(User user);

    User updateUser(User user);

    void deleteUser(Integer userId);

    List<User> getAllUsers();

    User getUser(int userId);

    List<User> selectUsersByName(String userName);
}

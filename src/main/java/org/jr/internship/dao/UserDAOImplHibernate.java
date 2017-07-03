package org.jr.internship.dao;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.jr.internship.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Доступ к базе данных
 */

@Repository
public class UserDAOImplHibernate implements UserDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void addUser(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }

    @Override
    public User updateUser(User user) {
        sessionFactory.getCurrentSession().update(user);
        return user;
    }

    @Override
    public void deleteUser(Integer userId) {
        User user = (User) sessionFactory.getCurrentSession().load(User.class, userId);
        if(user != null) {
            sessionFactory.getCurrentSession().delete(user);
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> getAllUsers() {
        return (List<User>)sessionFactory.getCurrentSession().createCriteria(User.class).list();
    }

    @Override
    public User getUser(int userId) {
        return (User) sessionFactory.getCurrentSession().get(User.class, userId);
    }

    @Override
    public List<User> selectUsersByName(String userName) {
        if(userName == null || userName.equals("")) {
            return getAllUsers();
        }
        return (List<User>)sessionFactory.getCurrentSession()
                .createCriteria(User.class)
                .add(Restrictions.eq("name", userName))
                .list();
    }
}

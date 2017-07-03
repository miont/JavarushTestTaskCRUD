package org.jr.internship.controller;

import org.jr.internship.model.User;
import org.jr.internship.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * Created by clement on 26.06.17.
 */
@Controller
@RequestMapping(value = "/")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = GET)
    public ModelAndView listUsers(ModelAndView model, HttpServletRequest request) {
        List<User> usersList = userService.selectUsersByName(request.getParameter("userName"));
        model.addObject("usersList", usersList);
        model.setViewName("home");
        return model;
    }

    @RequestMapping(value = "/newUser", method = GET)
    public ModelAndView newUser(ModelAndView model) {
        User user = new User();
        model.addObject("user", user);
        model.setViewName("userForm");
        return model;
    }

    @RequestMapping(value = "/saveUser", method = POST)
    public ModelAndView saveUser(@ModelAttribute User user) {
        System.out.println("User ID = " + user.getId());
        if(user.getId() == 0) {
            System.out.println("User ID is null!!!");
            userService.addUser(user);
        }
        else {
            userService.updateUser(user);
        }
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/deleteUser", method = GET)
    public ModelAndView deleteUser(HttpServletRequest request) {
        int userId = Integer.parseInt(request.getParameter("id"));
        userService.deleteUser(userId);
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/editUser", method = GET)
    public ModelAndView editUser(HttpServletRequest request) {
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = userService.getUser(userId);
        ModelAndView model = new ModelAndView();
        model.setViewName("/userForm");
        model.addObject("user", user);
        return model;
    }

//    @RequestMapping(value = "/searchUsersByName", method = GET)
//    public ModelAndView searchUsersByName(ModelAndView model, HttpServletRequest request) {
//        return listUsers(model,request);
//    }
}

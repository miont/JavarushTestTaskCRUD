package org.jr.internship.tests;


import org.jr.internship.controller.UserController;
import org.jr.internship.dao.UserDAO;
import org.jr.internship.model.User;
import org.jr.internship.service.UserService;
import org.jr.internship.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.ModelAndView;

//import static org.hamcrest.Matchers.contains;
//import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import static
        org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static
        org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static
        org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by clement on 26.06.17.
 */
public class UserControllerTest {

    @Test
    public void testHomePage() throws Exception {

        UserService repository = mock(UserService.class);

        UserController controller = new UserController(repository);

        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/")).andExpect(view().name("home"));
    }

//    @Test
//    public void shouldShowUsers() throws Exception {
//        List<User> expectedUsers = createUsersList(10);
//        UserService mockRepository = mock(UserService.class);
//        when(mockRepository.getAllUsers()).thenReturn(expectedUsers);
//
//        UserController controller = new UserController(mockRepository);
//
//        MockMvc mockMvc = standaloneSetup(controller)
////                .setSingleView(new InternalResourceView("/WEB-INF/pages/home.jsp"))
//                .build();
//
//        mockMvc.perform(get("/"))
//                .andExpect(view().name("home"))
//                .andExpect(model().attributeExists("usersList"))
//                .andExpect(model().attribute("usersList", contains(expectedUsers.toArray())));
//    }

//    private List<User> createUsersList(int count) {
//        List<User> users = new ArrayList<>();
//        for(int i=0; i<count; i++) {
//            users.add(new User("User " + i, (int)(Math.random()*100), Math.random() > 0.5 ? true : false));
//        }
//        return users;
//    }

}

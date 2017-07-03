package org.jr.internship.tests;


import org.jr.internship.controller.UserController;
import org.jr.internship.dao.UserDAO;
import org.jr.internship.service.UserService;
import org.jr.internship.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.ModelAndView;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
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

/**
 * Created by clement on 26.06.17.
 */
public class UserControllerTest {

    @Test
    public void testHomePage() throws Exception {

        UserService repository = mock(UserService.class);

       UserController controller = new UserController(repository);
//        UserController controller = new UserController();

//        assertEquals("home", controller.listUsers());
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/")).andExpect(view().name("home"));
    }
}

package com.gramazski.blog.service.impl;

import com.gramazski.blog.entity.User;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gs on 30.01.2017.
 */
public class UserServiceTest {
    @Test
    public void addUser() throws Exception {
        UserService userService = new UserService();
        User user = new User();
        user.setNickName("staas");
        user.setPassword("00");
        user.setEmail("ee");
        int id = userService.addUser(user).getId();

        user = userService.getUser(id);

        Assert.assertEquals("staas", user.getNickName());
    }

}
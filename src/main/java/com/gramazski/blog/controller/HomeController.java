package com.gramazski.blog.controller;

import com.gramazski.blog.entity.User;
import com.gramazski.blog.service.impl.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gs on 29.01.2017.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String home(){
        UserService userService = new UserService();
        User user = userService.findOne(1);
        return "index";
    }

    @RequestMapping(value = "/registr")
    public String regitr(){
        return "/index.jsp";
    }
}

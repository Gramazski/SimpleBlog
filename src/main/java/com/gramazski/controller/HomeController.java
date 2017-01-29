package com.gramazski.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gs on 29.01.2017.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String home(){
        return "index";
    }
}

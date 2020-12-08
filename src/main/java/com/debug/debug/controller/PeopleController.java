package com.debug.debug.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PeopleController {
    @GetMapping("/hello")
    public String hello(){
        return "index";
    }


}

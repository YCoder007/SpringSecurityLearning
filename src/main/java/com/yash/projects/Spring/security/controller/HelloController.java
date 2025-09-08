package com.yash.projects.Spring.security.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("")
    public String greet(HttpServletRequest request){
        return "Hellow From the other side "+  request.getSession().getId();
    }
}

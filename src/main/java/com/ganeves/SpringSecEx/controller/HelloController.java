package com.ganeves.SpringSecEx.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    String greet(HttpServletRequest request) {
        return "Welcome to the Jungle " + request.getSession().getId();
    }

}

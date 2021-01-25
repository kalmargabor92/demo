package com.example.demo.controller;

import com.example.demo.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public UserResponse user() {
        return new UserResponse("app1", userService.getUsers());
    }

    @GetMapping("/")
    public RedirectView index() {
        return new RedirectView("/index.html");
    }

}

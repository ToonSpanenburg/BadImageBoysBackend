package com.example.BadImageBoys.Controllers;

import com.example.BadImageBoys.Models.User;
import com.example.BadImageBoys.Services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
    private final UserService userService;

    @Autowired
    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String hello()
    {
        User newUser = new User(0,"admin");
        userService.save(newUser);
        return "Hello User";
    }
}

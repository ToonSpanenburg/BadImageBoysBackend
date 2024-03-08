package com.example.BadImageBoys.Controllers;

import com.example.BadImageBoys.Models.Item;
import com.example.BadImageBoys.Models.User;
import com.example.BadImageBoys.Models.Video;
import com.example.BadImageBoys.Services.ItemService;
import com.example.BadImageBoys.Services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.*;

@RestController
public class HomeController
{
    private final UserService userService;
    private final ItemService itemService;
    @Autowired
    public HomeController(UserService userService, ItemService itemService)
    {
        this.userService = userService;
        this.itemService = itemService;
    }

    public String hello()
    {
        User testUser = new User("TestUser");
        LocalDate today = LocalDate.now();
        Date date = java.sql.Date.valueOf(today);
        Item testItem = new Item(testUser,"test item", "lorem",date);
        Video anotherTestItem = new Video(testUser,"yee","dsf",date,"test","");
        userService.save(testUser);
        itemService.save(testItem);
        itemService.save(anotherTestItem);
        return "Hello User";
    }
    @RequestMapping("/")
    public List<Item> getAllItems()
    {
        List<Item> allItems = itemService.findAll();
        return allItems;
    }
}

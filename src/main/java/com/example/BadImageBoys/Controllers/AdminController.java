package com.example.BadImageBoys.Controllers;

import com.example.BadImageBoys.Models.User;
import com.example.BadImageBoys.Services.ItemService;
import com.example.BadImageBoys.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController
{
    //admin rights system will be implemented later
    private final UserService userService;
    private final ItemService itemService;

    @Autowired
    public AdminController(UserService userService, ItemService itemService)
    {
        this.userService = userService;
        this.itemService = itemService;
    }

    //user stuff
    @RequestMapping("/newuser")
    public void MakeUser(@RequestParam String username)
    {
        User newUser = new User(username);
        userService.save(newUser);
    }

    @RequestMapping("/edituser")
    public void EditUser(@RequestParam Long id, @RequestParam String username)
    {
        User editedUser = userService.findById(id).get();
        editedUser.setUsername(username);
        userService.save(editedUser);
    }

    @RequestMapping("/deleteuser")
    public void DeleteUser(@RequestParam Long id)
    {
        userService.deleteById(id);
    }

    //item stuff (article + video)

}

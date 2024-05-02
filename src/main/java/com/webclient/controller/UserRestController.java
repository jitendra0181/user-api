package com.webclient.controller;

import com.webclient.model.User;
import com.webclient.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserRestController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User createUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/")
    public List<User> getAllUsers(){
        return userService.getAllUser();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }
}

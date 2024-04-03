package com.yourBuddy.controller;

import com.yourBuddy.entity.User;
import com.yourBuddy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    @Autowired
    UserService userService;

    /**
     * retrieving list of users
     * @return
     */
    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    /**
     * Registering user
     * returning user
     */
    @PostMapping ("/registerUser")
    public User registerUser(@RequestBody User user){
        return userService.registerUser(user);
    }

    @GetMapping("/getUserbyId/{id}")
    public Optional<User> getUserbyId(@PathVariable (name = "id") Long id){
        return userService.getUserById(id);
    }
}

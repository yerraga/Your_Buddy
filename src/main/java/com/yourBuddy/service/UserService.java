package com.yourBuddy.service;

import com.yourBuddy.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public User registerUser(User user);


}

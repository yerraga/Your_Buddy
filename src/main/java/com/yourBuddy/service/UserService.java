package com.yourBuddy.service;

import com.yourBuddy.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public List<User> getAllUsers();

    public User registerUser(User user);


    Optional<User> getUserById(Long id);
}

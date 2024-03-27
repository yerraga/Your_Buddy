package com.yourBuddy.serviceImpl;

import com.yourBuddy.entity.User;
import com.yourBuddy.repository.UserRepository;
import com.yourBuddy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}

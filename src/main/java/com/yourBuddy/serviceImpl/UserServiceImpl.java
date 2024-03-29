package com.yourBuddy.serviceImpl;

import com.yourBuddy.entity.User;
import com.yourBuddy.enums.UserType;
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

    @Override
    public User registerUser(User user) {
        user.setFirstName(user.getFirstName());
        user.setLastName(user.getLastName());
        String userType = "NA";
        user.setUserType(user.getUserType() !=null ? UserType.valueOf(user.getUserType().toString()) : UserType.valueOf(userType));
        user.setEmail(user.getEmail());
        userRepository.save(user);
        return user;
    }
}

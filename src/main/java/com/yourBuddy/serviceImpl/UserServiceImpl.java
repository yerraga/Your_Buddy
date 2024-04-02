package com.yourBuddy.serviceImpl;

import com.yourBuddy.entity.User;
import com.yourBuddy.enums.UserType;
import com.yourBuddy.exception.UserException;
import com.yourBuddy.repository.UserRepository;
import com.yourBuddy.service.UserService;
import jdk.jshell.spi.ExecutionControl;
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
        if (user.getFirstName() == null){
            throw new UserException("First name cannot be empty");
        }
        else {
            user.setFirstName(user.getFirstName());
        }
        if(user.getLastName() == null){
            throw new UserException("Last name cannot be empty");
        }
        else {
            user.setLastName(user.getLastName());
        }
        String userType = "NA";
        user.setUserType(user.getUserType() !=null ? UserType.valueOf(user.getUserType().toString()) : UserType.valueOf(userType));
        if(user.getEmail() == null){
            throw new UserException("Email cannot be empty");
        }
        else {
            user.setEmail(user.getEmail());
        }
        userRepository.save(user);
        return user;
    }
}

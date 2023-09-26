package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(final User userData) {
        final User user = new User(
                userData.getName(), 
                userData.getCpf(), 
                userData.getType(), 
                userData.getPassword(),
                userData.getType());

                return userRepository.save(user);
    }

    public List<User> readUsers(){
        return userRepository.findAll();
    }

}

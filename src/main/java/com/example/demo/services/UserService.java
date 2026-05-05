package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepo;

@Service
public class UserService {

    private final UserRepo userRepository;

    public UserService(UserRepo userRepository) {
        this.userRepository = userRepository;
    }

    
    public List<User> findAll() {
        return userRepository.findAll();
    }

    
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

   
    public User save(User user) {
        return userRepository.save(user);
    }

    
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}

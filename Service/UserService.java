package com.example.audible.Service;

import com.example.audible.model.User;
import com.example.audible.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User saveUserDetails(User user){
        return userRepository.save(user);
    }

}

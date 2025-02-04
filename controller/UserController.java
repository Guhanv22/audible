package com.example.audible.controller;

import com.example.audible.Service.UserService;
import com.example.audible.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/addUserDetails")
    public User postUserDetails(@RequestBody User user){
        return userService.saveUserDetails(user);
    }

}


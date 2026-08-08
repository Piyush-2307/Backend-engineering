package com.peeyu.demo.controller;

import com.peeyu.demo.enums.Gender;
import com.peeyu.demo.enums.Role;
import com.peeyu.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peeyu.demo.domain.User;
import javax.swing.*;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUser();
    }
}

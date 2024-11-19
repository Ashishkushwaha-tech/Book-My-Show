package com.example.eazytech.BookMyShowApplication.controllers;

import com.example.eazytech.BookMyShowApplication.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService=userService;
    }

    public void createUser(){

    }
}

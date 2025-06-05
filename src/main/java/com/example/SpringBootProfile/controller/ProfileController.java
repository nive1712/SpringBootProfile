package com.example.SpringBootProfile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootProfile.config.MyAppConfig;

@RestController
public class ProfileController {

    @Autowired
    private MyAppConfig myAppConfig;
    
    @GetMapping("/")
    public String home() {
        return "Welcome to the Home Page!";
    }
    @GetMapping("/profile")
    public String getProfileMessage() {
        return myAppConfig.getMessage();
    }
}

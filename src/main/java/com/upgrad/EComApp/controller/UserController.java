package com.upgrad.EComApp.controller;

import com.upgrad.EComApp.entity.Product;
import com.upgrad.EComApp.entity.User;
import com.upgrad.EComApp.service.ProductService;
import com.upgrad.EComApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@Component
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/userWelcome")
    public ResponseEntity getUserWelcome(){
        return ResponseEntity.ok("Welcome to user Controller");
    }

    @GetMapping("/user/{id}")
    public ResponseEntity getUserDetails(@PathVariable("id") int id){
        User savedUser = userService.getUserDetails(id);
        return ResponseEntity.ok(savedUser);
    }

    @PostMapping("/user")
    public ResponseEntity saveProductDetails(@RequestBody User user){
        userService.saveUserDetails(user);
        return ResponseEntity.ok("User is saved");
    }
}

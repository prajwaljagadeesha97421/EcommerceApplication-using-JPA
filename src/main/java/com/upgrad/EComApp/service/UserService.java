package com.upgrad.EComApp.service;

import com.upgrad.EComApp.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserService {
    public User getUserDetails(int id);
    public void saveUserDetails(User user);
}

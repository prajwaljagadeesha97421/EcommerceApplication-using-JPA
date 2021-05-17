package com.upgrad.EComApp.service;

import com.upgrad.EComApp.entity.User;
import com.upgrad.EComApp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public User getUserDetails(int id) {
        return userRepo.findById(id).get();
    }

    @Override
    public void saveUserDetails(User user) {
        userRepo.save(user);
    }
}

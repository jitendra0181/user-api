package com.webclient.service;

import com.webclient.model.User;
import com.webclient.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public List<User> getAllUser(){
        return userRepo.findAll();
    }

    public User getUserById(Integer id){
        Optional<User> userId = userRepo.findById(id);
        if (userId.isPresent()){
            User user = userId.get();
            return user;
        }
        return null;
    }

    public User saveUser(User user){
        return userRepo.save(user);
    }
}

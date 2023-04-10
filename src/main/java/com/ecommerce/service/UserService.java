package com.ecommerce.service;

import com.ecommerce.model.User;
import com.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;


    public List<User> findAll(){
       return userRepository.findAll();
    }

    public User findAllByUsername(String username){
        HashMap<String, User> userHashMap = new HashMap<>();
        List<User> users = userRepository.findAll();

        for (User user: users){
            userHashMap.put(user.getUsername(),user);
        }
        return userHashMap.get(username);
    }

    public User findById(String id){
        return userRepository.findById(id);
    }

    public User save(User user){
        return userRepository.save(user);
    }

}

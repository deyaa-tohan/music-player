package com.ds.mp.userservice.service;

import com.ds.mp.userservice.entity.User;
import com.ds.mp.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public String findUserById(Long id) {
        String flight = findUser(id).toString();
        if (flight.isEmpty())
            return null;
        else
            return flight;
    }
    public User findUser(Long userId) {
        return userRepository.findById(userId).get();
    }

}

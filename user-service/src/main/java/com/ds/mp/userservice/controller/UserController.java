package com.ds.mp.userservice.controller;


import com.ds.mp.userservice.entity.User;
import com.ds.mp.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping ("/add")
    public ResponseEntity<?> add(@RequestBody User user){
        return ResponseEntity.ok(userService.saveUser(user));
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> get(@PathVariable ("id") Long id){
        return ResponseEntity.ok(userService.findUser(id).toString());
    }

    @GetMapping("/{userId}")
    public String findUser(@PathVariable Long userId) {
        return userService.findUserById(userId);
    }
}

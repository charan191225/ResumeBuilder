package com.resumebuilder.controller;

import com.resumebuilder.model.User;
import com.resumebuilder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getAllUsers")
    public ResponseEntity<List<User>> returnUser(){

        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);

    }

    @PostMapping("/loginPage")
    public ResponseEntity<?> loginUser(@RequestBody User userData){
        System.out.println(userData);
        if(userService.loginUser(userData))
            return new ResponseEntity<>(HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    @PostMapping("/signupPage")
    public ResponseEntity<?> signupUser(@RequestBody User userData){
        System.out.println(userData);
        if(userService.signupUser(userData) == 1)
            return new ResponseEntity<>(HttpStatus.OK);
        else if(userService.signupUser(userData) == 2)
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        else
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}

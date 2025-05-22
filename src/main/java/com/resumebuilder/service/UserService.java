package com.resumebuilder.service;

import com.resumebuilder.model.User;
import com.resumebuilder.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public boolean loginUser(User userData) {
        try {
            String userEmail = userData.getUserEmail();
            String userPassword = userData.getUserPassword();
            User result = userRepository.findByUserEmailAndUserPassword(userEmail, userPassword).get();
            System.out.println("This " + result);

            System.out.println(true);
            return true;
        } catch (Exception e) {
            System.out.println(false);
            return false;
        }


    }

    public int signupUser(User userData) {

        try {
            String userEmail = userData.getUserEmail();
            String userPassword = userData.getUserPassword();
            User result = userRepository.findByUserEmail(userEmail).get();
            System.out.println("This " + result);
            if (Objects.equals(result.getUserEmail(), userData.getUserEmail()))
                return 2;
        } catch (Exception e) {
            System.out.println(userRepository.save(userData));
            return 1;
        }
        return 3;
    }


    public List<User> getAllUsers() {
            return userRepository.findAll();
        }

}

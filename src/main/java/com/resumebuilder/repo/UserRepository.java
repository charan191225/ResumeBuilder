package com.resumebuilder.repo;

import com.resumebuilder.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository  extends JpaRepository<User, Integer> {

    Optional<User> findByUserEmailAndUserPassword(String userEmail, String userPassword);
    Optional<User> findByUserEmail(String userEmail);
}

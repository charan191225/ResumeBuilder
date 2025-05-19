package com.resumebuilder.repo;

import com.resumebuilder.model.User;
import com.resumebuilder.model.resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<resume, Integer> {
}

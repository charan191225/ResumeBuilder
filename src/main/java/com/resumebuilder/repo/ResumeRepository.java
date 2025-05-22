package com.resumebuilder.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.resumebuilder.model.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResumeRepository extends JpaRepository<Resume, Integer> {
}

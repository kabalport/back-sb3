package com.kabalport.backsb3.score.repository;

import com.kabalport.backsb3.score.model.StudentScore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentScoreRepository extends JpaRepository<StudentScore, Long> {}

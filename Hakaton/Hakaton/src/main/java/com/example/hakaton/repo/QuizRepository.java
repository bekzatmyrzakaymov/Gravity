package com.example.hakaton.repo;

import com.example.hakaton.entity.QuizEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<QuizEntity,Long> {
}

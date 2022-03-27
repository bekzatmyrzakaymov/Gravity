package com.example.hakaton.repo;

import com.example.hakaton.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity,Long> {
    StudentEntity getStudentEntityById(Long id);
    StudentEntity getStudentEntityByEmail(String email);
    Boolean existsStudentEntityByEmail(String email);
}

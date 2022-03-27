package com.example.hakaton.repo;

import com.example.hakaton.entity.TeachEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeachRepository extends JpaRepository<TeachEntity,Long> {
    TeachEntity getTeachEntityById(Long id);
    Boolean existsTeachEntityByEmail(String email);
    TeachEntity getTeachEntityByEmail(String email);
}

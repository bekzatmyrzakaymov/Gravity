package com.example.hakaton.repo;

import com.example.hakaton.entity.SchoolEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<SchoolEntity,Long> {
}

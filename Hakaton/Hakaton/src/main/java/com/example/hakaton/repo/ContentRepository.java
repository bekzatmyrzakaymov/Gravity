package com.example.hakaton.repo;

import com.example.hakaton.entity.ContentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ContentRepository extends JpaRepository<ContentEntity,Long> {

    @Query("Select c from ContentEntity c")
    List<ContentEntity> getAllContents();

}

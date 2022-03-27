package com.example.hakaton.repo;

import com.example.hakaton.entity.ContentEntity;
import com.example.hakaton.entity.LikeEntity;
import com.example.hakaton.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LikeRepository extends JpaRepository<LikeEntity,Long> {

    @Query("Select l.contentEntity from LikeEntity l where l.studentEntity = ?1")
    List<ContentEntity> getLikedContents(StudentEntity studentEntity);
}

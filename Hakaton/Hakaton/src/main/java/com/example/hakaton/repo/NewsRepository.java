package com.example.hakaton.repo;

import com.example.hakaton.entity.NewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NewsRepository extends JpaRepository<NewsEntity,Long> {
    @Query("Select n from NewsEntity n where n.has_media=true")
    List<NewsEntity> getMediaNews();

    @Query("Select n from NewsEntity n where n.has_media=false")
    List<NewsEntity> getTextNews();

    @Query("SELECT n FROM NewsEntity n WHERE n.title LIKE ?1% or n.newsText Like ?1%")
    List<NewsEntity> getNewsBySearch(String search);

}

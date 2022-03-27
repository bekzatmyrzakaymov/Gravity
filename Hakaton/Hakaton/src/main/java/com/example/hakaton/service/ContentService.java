package com.example.hakaton.service;

import com.example.hakaton.entity.ContentEntity;
import com.example.hakaton.entity.NewsEntity;
import com.example.hakaton.repo.ContentRepository;
import com.example.hakaton.repo.LikeRepository;
import com.example.hakaton.repo.NewsRepository;
import com.example.hakaton.repo.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ContentService {
    final ContentRepository contentRepository;
    final NewsRepository newsRepository;
    final LikeRepository likeRepository;
    final StudentRepository studentRepository;

    public List<NewsEntity> getMediaNews(){
        return newsRepository.getMediaNews();
    }

    public List<NewsEntity> getTextNews(){
        return newsRepository.getTextNews();
    }

    public List<NewsEntity> getNewsBySearch(String search){
        return newsRepository.getNewsBySearch(search);
    }

    public List<ContentEntity> getReels(){
        return contentRepository.getAllContents();
    }

    public List<ContentEntity> getReelsByLike(Long id){
        return likeRepository.getLikedContents(studentRepository.getStudentEntityById(id));
    }

}

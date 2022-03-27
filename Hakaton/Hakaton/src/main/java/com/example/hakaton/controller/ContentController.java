package com.example.hakaton.controller;

import com.example.hakaton.entity.ContentEntity;
import com.example.hakaton.entity.NewsEntity;
import com.example.hakaton.service.ContentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/content")
@AllArgsConstructor
public class ContentController {
    final ContentService contentService;

    @GetMapping("/getMediaNews")
    public List<NewsEntity> getMediaNews(){
        return contentService.getMediaNews();
    }

    @GetMapping("/getTextNews")
    public List<NewsEntity> getTextNews(){
        return contentService.getTextNews();
    }

    @GetMapping("/search")
    public List<NewsEntity> getNewsBySearch(@RequestParam String search){
        return contentService.getNewsBySearch(search);
    }

    @GetMapping("/getReels")
    public List<ContentEntity> getReels(){
        return contentService.getReels();
    }

    @GetMapping("/getReelsByLike")
    public List<ContentEntity> getReelsByLike(@RequestParam Long id){
        return contentService.getReelsByLike(id);
    }
}

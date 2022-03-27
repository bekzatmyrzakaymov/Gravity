package com.example.hakaton.entity;

import javax.persistence.*;

@Entity
@Table(name = "news")
public class NewsEntity {
    @Id
    @Column(name = "new_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Boolean has_media = false;
    @Lob
    private String newsText;
    @Lob
    private String mediaUrl = null;
    @Lob
    private String title;

}

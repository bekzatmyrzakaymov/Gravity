package com.example.hakaton.entity;

import javax.persistence.*;

@Entity
@Table(name = "likes")
public class LikeEntity {
    @Id
    @Column(name = "like_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne()
    private StudentEntity studentEntity;

    @ManyToOne()
    private ContentEntity contentEntity;

}

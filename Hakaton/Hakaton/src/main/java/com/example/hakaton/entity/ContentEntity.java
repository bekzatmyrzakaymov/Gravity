package com.example.hakaton.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "contents")
@Getter@Setter
public class ContentEntity {
    @Id
    @Column(name = "content_id", nullable = false)
    private Long id;
    @Lob
    private String contentUrl;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private TeachEntity teach;

    private int likeCounter;


}

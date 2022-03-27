package com.example.hakaton.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "teach")
@Getter@Setter
public class TeachEntity {
    @Id
    @Column(name = "teach_id", nullable = false)
    private Long id;
    private String name;
    private String surname;
    @Lob
    private String photoUrl;//There must be default photo url
    private String email;
    private String password;
    private String type = "teacher";
    private Boolean is_adviser = false;
    private Boolean is_tutor = false;
    @Lob
    private String profile_text = null;
    private String subject = null;
    private Integer price_for_hour = null;
    @ManyToOne
    private SchoolEntity school;

}

package com.example.hakaton.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "students")
@Getter@Setter
public class StudentEntity {
    @Id
    @Column(name = "student_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private String password;
    private String name;
    private String surname;
    private String photoUrl;//There must be default photo url
    private String grade;
    private String letter;
    private double rating = 0;
    @ManyToOne()
    private TeachEntity teach;
}

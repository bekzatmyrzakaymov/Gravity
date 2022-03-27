package com.example.hakaton.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "schools")
@Getter@Setter
public class SchoolEntity {
    @Id
    @Column(name = "school_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String city;
    private String school;
}

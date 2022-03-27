package com.example.hakaton.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "quiz")
@Getter@Setter
public class QuizEntity {
    @Id
    @Column(name = "quiz_id", nullable = false)
    private Long id;
    @Lob
    private String questionText;

    private String subject;

    @Lob
    private String answers;

    @Lob
    private String true_answer;
}

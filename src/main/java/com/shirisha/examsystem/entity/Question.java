package com.shirisha.examsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String correctOption;   // "A", "B", "C" or "D"

    @ManyToOne
    private Exam exam;
}
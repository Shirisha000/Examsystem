package com.shirisha.examsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private int durationMinutes;

    // One exam has many questions; saving the exam saves its questions too
    @OneToMany(mappedBy = "exam", cascade = CascadeType.ALL)
    private List<Question> questions = new ArrayList<>();
}
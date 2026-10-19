package com.shirisha.examsystem.repository;

import com.shirisha.examsystem.entity.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<Exam, Long> {
}
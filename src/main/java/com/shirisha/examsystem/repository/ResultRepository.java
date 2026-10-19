package com.shirisha.examsystem.repository;

import com.shirisha.examsystem.entity.Exam;
import com.shirisha.examsystem.entity.Result;
import com.shirisha.examsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ResultRepository extends JpaRepository<Result, Long> {
    boolean existsByStudentAndExam(User student, Exam exam);
    List<Result> findByStudent(User student);
    List<Result> findByExam(Exam exam);
}
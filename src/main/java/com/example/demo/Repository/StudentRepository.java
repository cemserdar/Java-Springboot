package com.example.demo.Repository;

import com.example.demo.Model.StudentModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel, Integer> {
}

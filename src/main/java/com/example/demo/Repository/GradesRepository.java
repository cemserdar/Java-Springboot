package com.example.demo.Repository;

import com.example.demo.Model.GradesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradesRepository extends JpaRepository<GradesModel,Integer> {
}

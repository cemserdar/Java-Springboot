package com.example.demo.Model;

import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Grades")

public class GradesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
     int gradeId;

    @Column(name = "code")
     String code;

    @Column(name = "value")
     int value;

    @JoinColumn(name = "student_id")
    @ManyToOne
     StudentModel student;
}
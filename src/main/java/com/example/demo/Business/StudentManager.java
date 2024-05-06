package com.example.demo.Business;

import java.util.*;

import com.example.demo.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import com.example.demo.Model.GradesModel;
import com.example.demo.Model.StudentModel;

import static java.lang.Integer.parseInt;

@Service
public class StudentManager implements StudentService {
    private StudentRepository studentRepository;

    public StudentManager(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentModel Add(StudentModel model) {
        GradesModel gradesModel = new GradesModel();
        Scanner input = new Scanner(System.in);
        System.out.println("İsim Giriniz");
        model.setName(input.nextLine());
        System.out.println("Soyisim Giriniz");
        model.setSurname(input.nextLine());
        System.out.println("Öğrenci Numarası Giriniz");
        model.setStdNumber(input.nextLine());

        System.out.println("Girilecek Ders Sayısını Yazınız: ");
        int ders = input.nextInt();
        int sonuc = 0;

        for (int i = 0; i < ders; i++) {
            System.out.println("Ders Kodu:");
            gradesModel.setCode(input.nextLine());
        }
        for (int i = 0; i < ders; i++) {

            if (ders == 1) {
                System.out.println("Ders Notu:");
                gradesModel.setValue(input.nextInt());

            } else {
                System.out.println("Ders Notu:");
                gradesModel.setValue(input.nextInt());
                int ortalama;
                ortalama = gradesModel.getValue();

                sonuc = parseInt(String.valueOf(ortalama)) / ders;
                gradesModel.setValue(sonuc);
            }
        }


        model.setGrades(gradesModel);

        return model;
    }

}

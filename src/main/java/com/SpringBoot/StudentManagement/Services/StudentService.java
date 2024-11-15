package com.SpringBoot.StudentManagement.Services;

import com.SpringBoot.StudentManagement.Model.Student;
import com.SpringBoot.StudentManagement.Repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repository;

    public List<Student> get(){
        return repository.findAll();
    }

}
package com.sabit.SpringBoot55.service;


import com.sabit.SpringBoot55.model.Student;
import com.sabit.SpringBoot55.repository.Studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private Studentrepo repo;

    public void saveStudent(Student s){
        repo.save(s);
    }

    public List<Student> getAllStudent(){
        return repo.findAll();
    }

    public Student findById(int id){
        return repo.findById(id).get();
    }
}

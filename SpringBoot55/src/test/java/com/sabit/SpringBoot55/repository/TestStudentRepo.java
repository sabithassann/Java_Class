package com.sabit.SpringBoot55.repository;

import com.sabit.SpringBoot55.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


@DataJpaTest
public class TestStudentRepo {

    @Autowired
    private StudentRepoImpl repo;


    @Test

    public void testAddStudent(){
        Student student=new Student();

        student.setRoll(10);
        student.setName("Sabit");
        student.setMail("sabit@gmail.com");

        boolean isAdded = repo.addStudent(student);
        assertTrue(isAdded);
    }

}

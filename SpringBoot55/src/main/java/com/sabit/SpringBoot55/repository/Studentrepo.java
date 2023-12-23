package com.sabit.SpringBoot55.repository;

import com.sabit.SpringBoot55.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Studentrepo extends JpaRepository<Student,Integer> {

}

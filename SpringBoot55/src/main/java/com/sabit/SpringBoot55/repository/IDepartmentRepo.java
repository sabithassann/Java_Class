package com.sabit.SpringBoot55.repository;

import com.sabit.SpringBoot55.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDepartmentRepo extends JpaRepository<Department ,Integer> {
}

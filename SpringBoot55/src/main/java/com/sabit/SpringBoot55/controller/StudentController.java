package com.sabit.SpringBoot55.controller;


import com.sabit.SpringBoot55.model.Department;
import com.sabit.SpringBoot55.model.Student;
import com.sabit.SpringBoot55.service.DepartmentService;
import com.sabit.SpringBoot55.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller

@RequestMapping("/student")
public class StudentController {
  @Autowired
    private StudentService studentService;
  @Autowired
    private DepartmentService dservice;


  @GetMapping("/")
    public String allStudent(Model m){

      List<Student> studentList=studentService.getAllStudent();
      m.addAttribute("studentList",studentList);
      m.addAttribute("title", "All Student");
      return "studenthome";

  }


  @GetMapping("/addform")

    public String addStudent(Model m){
      List<Department> depList=dservice.getAllDepartment();
      m.addAttribute("department",new Department());
      m.addAttribute("depList",depList);
  }
}

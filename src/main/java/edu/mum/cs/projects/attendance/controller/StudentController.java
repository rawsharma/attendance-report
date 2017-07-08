package edu.mum.cs.projects.attendance.controller;

import edu.mum.cs.projects.attendance.domain.entity.Student;
import edu.mum.cs.projects.attendance.service.StudentService;
import edu.mum.cs.projects.attendance.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.security.Principal;
import java.util.List;

/**
 * Created by Raw on 7/5/2017.
 */
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

   /* @GetMapping("/")
    public String homePage() {
        return "student";
    }*/

    @GetMapping("/rs/students")
    public List<Student> getAllStudents(){

        return studentService.getStudentsByEntry("2006-8-14") ;
    }



}

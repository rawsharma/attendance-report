package edu.mum.cs.projects.attendance.controller;

import edu.mum.cs.projects.attendance.domain.entity.Student;
import edu.mum.cs.projects.attendance.service.StudentService;
import edu.mum.cs.projects.attendance.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Raw on 7/6/2017.
 */
@Controller
public class HomeController {
    /*@Autowired
    private StudentServiceImpl studentServiceImpl;

    @RequestMapping("/")
    public String homePage() {
        return "home";
    }

    @GetMapping("/students")
    public String viewStudents(Model model){
        List<Student> studentList= studentServiceImpl.getStudentsByEntry("2006-8-14");
        model.addAttribute("students",studentList);
        return "student";
    }*/

    @Autowired
    private StudentService studentService;

    @RequestMapping("/")
    public String homePage() {
        return "home";
    }

    @GetMapping("/students")
    public String viewStudents(Model model){
        List<Student> studentList= studentService.getStudentsByEntry("2006-8-14");
        model.addAttribute("students",studentList);
        return "student";
    }
}

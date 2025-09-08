package com.yash.projects.Spring.security.controller;


import com.yash.projects.Spring.security.entity.Student;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Data
public class StudentController {

    private List<Student> students= new ArrayList<>(List.of(
            new Student(1,21,"Yash"),
            new Student( 2,31,"Yash2")
    ));


    @GetMapping("/students")
    public List<Student> getStudent(){

    }
}

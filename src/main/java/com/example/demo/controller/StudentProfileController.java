package com.example.demo.controller;

import com.example.demo.services.StudentProfileService;
import com.example.demo.studentprofile.StudentProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentProfileController {
    private StudentProfileService studentProfileService;
    @Autowired
    public StudentProfileController(StudentProfileService studentProfileService) {
        this.studentProfileService = studentProfileService;
    }
    @PostMapping("/student profile/create")
    public String create(@RequestBody StudentProfile studentProfile){
        studentProfileService.createStudentProfile(studentProfile);
        return "Student Profile is Successfully Stored";
    }
    //path variable
    @GetMapping("/student profile/{studentId}")
    public StudentProfile get(@PathVariable Long studentId){
        return studentProfileService.getStudentProfileById(studentId);
    }
}

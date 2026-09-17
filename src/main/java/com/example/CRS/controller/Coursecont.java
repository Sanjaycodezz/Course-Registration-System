package com.example.CRS.controller;

import com.example.CRS.model.Course;
import com.example.CRS.model.Cregistry;
import com.example.CRS.service.Courseser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5500")
public class Coursecont {
    @Autowired
    Courseser crs;

    @GetMapping("Course")
    public List<Course> Availablecourse(){
        return   crs.Availablecrs();

    }

    @PostMapping("/course/register")
    public String courseenrol(@RequestParam("coursename")String coursename,
                              @RequestParam("emailid") String emailid,
                              @RequestParam("name")String name){
         crs.crenrol(coursename,emailid,name);
         return "Congratulations " +name+ " Enrollment for " +coursename;
    }

    @GetMapping("/")
    public String home(){
        return "HOME PAGE";
    }
}
